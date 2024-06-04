import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {		

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			int cabbageNum = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[width][height];
			
			for (int cnx = 0; cnx < cabbageNum; cnx++) {
				st = new StringTokenizer(br.readLine(), " ");
				map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			int cnt = 0;
			for(int i=0; i<width; i++)
				for(int j=0; j<height; j++) {
					if(map[i][j]==1) {
						bfs(map, i, j, width, height);
						cnt++;
					}
				}
			System.out.println(cnt);
			
		}

	}
	
	public static void bfs(int[][] map, int i, int j, int width, int height) {
		map[i][j] = 0;
		if(i+1<width  && map[i+1][j]==1) bfs(map, i+1, j, width, height);
		if(i-1>-1     && map[i-1][j]==1) bfs(map, i-1, j, width, height);
		if(j+1<height && map[i][j+1]==1) bfs(map, i, j+1, width, height);
		if(j-1>-1     && map[i][j-1]==1) bfs(map, i, j-1, width, height);
	}

}
