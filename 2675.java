import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String testCase = br.readLine(); // 테스트 케이스 갯수 
		
		for(int i = 0; i < Integer.parseInt(testCase); i++)
		{
			String textS = br.readLine();
			int loopCnt = Integer.parseInt(textS.split(" ")[0]); // 3
			String text = textS.split(" ")[1]; // ABC
			
			for(int loop = 0; loop < text.length(); loop++) {
				String loopText = text.split("")[loop]; // A .. B .. C
				for(int textLoop = 0; textLoop < loopCnt; textLoop++) {
					bw.write(loopText);
				}
			}
			
			if(i != Integer.parseInt(testCase)) {
				bw.write("\n");
			}
		}
		
		bw.flush();
		bw.close();

	}
}
