package kr.co.openeg.lab.board.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.openeg.lab.board.model.BoardCommentModel;
import kr.co.openeg.lab.board.model.BoardModel;
import kr.co.openeg.lab.board.service.BoardService;
import kr.co.openeg.lab.test.util.TestUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource(name="boardService")
	private BoardService service ;
	
	//
	// * User variable
	// article, page variables
	private int currentPage = 1;
	private int showArticleLimit = 10; // change value if want to show more articles by one page
	private int showPageLimit = 10; // change value if want to show more page links
	private int startArticleNum = 0;
	private int endArticleNum = 0;
	private int totalNum = 0;
	//
	// file upload path
  	//private String uploadPath = "D:\\Workspace\\SummerBoard\\WebContent\\files\\";
	//
	//
	
	@RequestMapping("/main.do")
	public String login_success_main(HttpServletRequest request){		
		return "/board/login_success_main";
	}
	
	@RequestMapping("/list.do")
	public ModelAndView boardList(HttpServletRequest request, HttpServletResponse response){
		
		
		String type = null;
		String keyword = null;		
		
		// set variables from request parameter
		if(request.getParameter("page") == null || request.getParameter("page").trim().isEmpty() || request.getParameter("page").equals("0")) {
			currentPage = 1;
		} else {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		
		if(request.getParameter("type") != null){
			type = request.getParameter("type").trim();
		}
		
		if(request.getParameter("keyword") != null){
			keyword = request.getParameter("keyword").trim();
		}
		//
		
		// expression article variables value
		startArticleNum = (currentPage - 1) * showArticleLimit + 1;
		endArticleNum = startArticleNum + showArticleLimit -1;
		//
		
		// get boardList and get page html code
		List<BoardModel> boardList;
		if(type != null && keyword != null){
			boardList = service.searchArticle(type, keyword, startArticleNum, endArticleNum);
			totalNum = service.getSearchTotalNum(type, keyword);
		} else {
			boardList = service.getBoardList(startArticleNum, endArticleNum);
			totalNum = service.getTotalNum();
		}
		StringBuffer pageHtml = getPageHtml(currentPage, totalNum, showArticleLimit, showPageLimit, type, keyword);
		//
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList);
		mav.addObject("pageHtml", pageHtml);
		mav.setViewName("/board/list");
		
		return mav;
	}
	
	// A method for Creating page html code
	private StringBuffer getPageHtml(int currentPage, int totalNum, int showArticleLimit, int showPageLimit, String type, String keyword) {
		StringBuffer pageHtml = new StringBuffer();
		int startPage = 0;
		int lastPage = 0;
		
		// expression page variables
		startPage = ((currentPage-1) / showPageLimit) * showPageLimit + 1;
		lastPage = startPage + showPageLimit - 1;
		
		if(lastPage > totalNum / showArticleLimit) {
			lastPage = (totalNum / showArticleLimit) + 1;
		}
		//
		
		// create page html code
		// if: when no search	
		if(type == null && keyword == null){			
			if(currentPage == 1){
				pageHtml.append("<span>");
			} else {
				pageHtml.append("<span><a href=\"list.do?page=" + (currentPage-1) + "\"><이전></a>&nbsp;&nbsp;");
			}
			
			for(int i = startPage ; i <= lastPage ; i++) {
				if(i == currentPage){
					pageHtml.append(".&nbsp;<strong>");
					pageHtml.append("<a href=\"list.do?page=" +i + "\" class=\"page\">" + i + "</a>");
					pageHtml.append("&nbsp;</strong>");
				} else {
					pageHtml.append(".&nbsp;<a href=\"list.do?page=" +i + "\" class=\"page\">" + i + "</a>&nbsp;");
				}
				
			}
			if(currentPage == lastPage){
				pageHtml.append(".</span>");
			} else {
				pageHtml.append(".&nbsp;&nbsp;<a href=\"list.do?page=" + (currentPage+1) + "\"><다음></a></span>");
			}
		//
		// else: when search
		} else {			
			if(currentPage == 1){
				pageHtml.append("<span>");
			} else {
				pageHtml.append("<span><a href=\"list.do?page=" + (currentPage-1) + "&type=" + type + "&keyword=" + keyword + "\"><이전></a>&nbsp;&nbsp;");
			}
			
			for(int i = startPage ; i <= lastPage ; i++) {
				if(i == currentPage){
					pageHtml.append(".&nbsp;<strong>");
					pageHtml.append("<a href=\"list.do?page=" +i + "&type=" + type + "&keyword=" + keyword + "\" class=\"page\">" + i + "</a>&nbsp;");
					pageHtml.append("&nbsp;</strong>");
				} else {
					pageHtml.append(".&nbsp;<a href=\"list.do?page=" +i + "&type=" + type + "&keyword=" + keyword + "\" class=\"page\">" + i + "</a>&nbsp;");
				}
				
			}
			if(currentPage == lastPage){
				pageHtml.append("</span>");
			} else {
				pageHtml.append(".&nbsp;&nbsp;<a href=\"list.do?page=" + (currentPage+1) + "&type=" + type + "&keyword=" + keyword + "\"><다음></a></span>");
			}
		}
		//		
		return pageHtml;
	}
	
	@RequestMapping("/view.do")
	public ModelAndView boardView(HttpServletRequest request, HttpSession session){
		int idx =TestUtil.getInt(request.getParameter("idx"));		
		BoardModel board = service.getOneArticle(idx); // get selected article model
		if ( board != null ) {
			session.setAttribute("idx", idx);
			service.updateHitcount(board.getHitcount()+1, idx); // update hitcount
			
			List<BoardCommentModel> commentList = service.getCommentList(idx); // get comment list
			
			ModelAndView mav = new ModelAndView();
			mav.addObject("board", board);
			mav.addObject("commentList", commentList);
			mav.setViewName("/board/view");
			return mav;
		} else {
			return null;
		}
		
	}
	
	@RequestMapping("/write.do")
	public String boardWrite(@ModelAttribute("BoardModel") BoardModel boardModel){		
		return "/board/write";
	}
	
	@RequestMapping("/get_image.do")
	public void getImage(HttpServletRequest request, HttpSession session, 
			                       HttpServletResponse response){
		int idx=TestUtil.getInt(request.getParameter("idx"));
		// 읽어본 게시물인지 확인
		if ( session.getAttribute("idx") ==  null  || 
				  (Integer)session.getAttribute("idx") != idx  ) {
			return;
		}
		// 저장된 파일명을 읽어오는 작업이 필요
		BoardModel board = service.getOneArticle(idx);
		
		String filePath=session.getServletContext().getRealPath("/")+
				                  "WEB-INF/files/"+board.getSavedFileName();
		
		System.out.println("filename: "+filePath);
		BufferedOutputStream out=null;
		InputStream in=null;
		try {
			response.setContentType("image/jpeg");
			response.setHeader("Content-Disposition", "inline;filename="+board.getFileName());
			File file=new File(filePath);
			in=new FileInputStream(file);
			out=new BufferedOutputStream(response.getOutputStream());
			int len;
			byte[] buf=new byte[1024];
			while ( (len=in.read(buf)) > 0) {
				out.write(buf,0,len);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("파일 전송 에러");
		} finally {
			if ( out != null ) try { out.close(); }catch(Exception e){}
			if ( in != null ) try { in.close(); }catch(Exception e){}
		}
		
	}
	
	
	@RequestMapping(value="/write.do", method=RequestMethod.POST)
	public String boardWriteProc(@ModelAttribute("BoardModel") BoardModel boardModel, MultipartHttpServletRequest request, HttpSession session){
		//파일저장 위치
		String uploadPath = session.getServletContext().getRealPath("/")
				                          +"WEB-INF/files/";
		System.out.println("uploadPath: "+uploadPath);
		MultipartFile file = request.getFile("file");
		//업로드 되는 파일 사이즈 제한
		if ( file != null && ! "".equals(file.getOriginalFilename()) 
			 && file.getSize() < 1024000 && file.getContentType().contains("image")){
			//업로드 파일명
			String fileName = file.getOriginalFilename();
			if (  fileName.toLowerCase().endsWith(".jpg")){
			   //저장할 파일명을 랜덤하게 생성하여 사용한다.
	           String savedFileName = UUID.randomUUID().toString();
			   File uploadFile = new File(uploadPath+ savedFileName);
		    	try {
				     file.transferTo(uploadFile);  //실제 파일이 저장되는 라인
			    } catch (Exception e) {
				      System.out.println("upload error");
			   }
			   boardModel.setFileName(fileName);
			   boardModel.setSavedFileName(savedFileName);
			}
		}

		String content =  boardModel.getContent().replaceAll("\r\n", "<br />");		
		boardModel.setContent(content);

		service.writeArticle(boardModel);		
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/commentWrite.do")
	public ModelAndView commentWriteProc(@ModelAttribute("CommentModel") BoardCommentModel commentModel){
		// new line code change to <br /> tag
		String content = commentModel.getContent().replaceAll("\r\n", "<br />");
		commentModel.setContent(content);
		//
		service.writeComment(commentModel);
		ModelAndView mav = new ModelAndView();
		mav.addObject("idx", commentModel.getLinkedArticleNum());
		mav.setViewName("redirect:view.do");
		
		return mav;
	}
	
	@RequestMapping("/modify.do")
	public ModelAndView boardModify(HttpServletRequest request, HttpSession session){
		String userId = (String) session.getAttribute("userId");
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardModel board = service.getOneArticle(idx);
		// <br /> tag change to new line code
		String content = board.getContent().replaceAll("<br />", "\r\n");
		board.setContent(content);
		//
		
		ModelAndView mav = new ModelAndView();
		
		if(!userId.equals(board.getWriterId())){
			mav.addObject("errCode", "1");	// forbidden connection
			mav.addObject("idx", idx);
			mav.setViewName("redirect:view.do");
		} else {
			mav.addObject("board", board);
			mav.setViewName("/board/modify");
		}		
		
		return mav;
	}
	
	@RequestMapping(value = "/modify.do", method=RequestMethod.POST)
	public ModelAndView boardModifyProc(@ModelAttribute("BoardModel") BoardModel boardModel, MultipartHttpServletRequest request){
		String uploadPath=request.getContextPath()+"/files/";
		String orgFileName = request.getParameter("orgFile");
		MultipartFile newFile = request.getFile("newFile");
		String newFileName = newFile.getOriginalFilename();
		
		boardModel.setFileName(orgFileName);
		
		// if: when want to change upload file
		if(newFile != null && !newFileName.equals("")){
			if(orgFileName != null || !orgFileName.equals("")){
				// remove uploaded file
				File removeFile = new File(uploadPath  + orgFileName);
				removeFile.delete();
				//
			}
			// create new upload file
			File newUploadFile = new File(uploadPath +newFileName);
			try {
				newFile.transferTo(newUploadFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//
			boardModel.setFileName(newFileName);
		}
		//
		// new line code change to <br /> tag
		String content =  boardModel.getContent().replaceAll("\r\n", "<br />");		
		boardModel.setContent(content);
		//
		
		service.modifyArticle(boardModel);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("idx", boardModel.getIdx());
		mav.setViewName("redirect:/board/view.do");
		return mav;
	}
	
	@RequestMapping("/delete.do")
	public ModelAndView boardDelete(HttpServletRequest request, HttpSession session){
		String uploadPath=request.getContextPath()+"/files/";
		System.out.println("uploadPath: "+uploadPath);
		String userId = (String) session.getAttribute("userId");
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardModel board = service.getOneArticle(idx);
		
		ModelAndView mav = new ModelAndView();
		
		if(!userId.equals(board.getWriterId())){
			mav.addObject("errCode", "1");	// it's forbidden connection
			mav.addObject("idx", idx);
			mav.setViewName("redirect:view.do");
		} else {
			List<BoardCommentModel> commentList = service.getCommentList(idx); // check comments
			if(commentList.size() > 0){
				mav.addObject("errCode", "2"); // can't delete because a article has comments
				mav.addObject("idx", idx);
				mav.setViewName("redirect:view.do");
			} else {
				// if: when the article has upload file - remove that
				if(board.getFileName() != null){
					File removeFile = new File(uploadPath + board.getFileName());
					removeFile.delete();
				}
				//				
				service.deleteArticle(idx);
				
				mav.setViewName("redirect:list.do");
			}
		}		
		return mav;
	}
	
	@RequestMapping("/commentDelete.do")
	public ModelAndView commendDelete(HttpServletRequest request, HttpSession session){
		int idx = Integer.parseInt(request.getParameter("idx"));
		int linkedArticleNum = Integer.parseInt(request.getParameter("linkedArticleNum"));
		
		String userId = (String) session.getAttribute("userId");
		BoardCommentModel comment = service.getOneComment(idx);
		
		ModelAndView mav = new ModelAndView();
		
		if(!userId.equals(comment.getWriterId())){
			mav.addObject("errCode", "1");
		} else {
			service.deleteComment(idx);
		}		
				
		mav.addObject("idx", linkedArticleNum); // move back to the article
		mav.setViewName("redirect:view.do");
		
		return mav;
	}
	
	@RequestMapping("/recommend.do")
	public ModelAndView updateRecommendcount(HttpServletRequest request, HttpSession session){
		int idx = Integer.parseInt(request.getParameter("idx"));
		String userId = (String) session.getAttribute("userId");
		BoardModel board = service.getOneArticle(idx);
		
		ModelAndView mav = new ModelAndView();
		
		if(userId.equals(board.getWriterId())){
			mav.addObject("errCode", "1");
		} else {
			service.updateRecommendCount(board.getRecommendcount()+1, idx);
		}
		
		mav.addObject("idx", idx);
		mav.setViewName("redirect:/board/view.do");
		
		return mav;
	}
}
