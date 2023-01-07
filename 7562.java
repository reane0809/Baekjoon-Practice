import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
static int testcase;
static boolean visit[][];
static int N;
static class point{
	int y;
	int x;
	int cnt;
	point(int y,int x,int cnt){
		this.y = y;
		this.x =x;
		this.cnt = cnt;
	}
}
static int starty;
static int startx;
static int endy;
static int endx;
static int dx[] = {1,2,2,1,-1,-2,-2,-1};
static int dy[] = {-2,-1,1,2,2,1,-1,-2};
static int ans;
static Queue<point> q;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		testcase = Integer.parseInt(in.readLine());
		while(testcase-->0) {
			N = Integer.parseInt(in.readLine());
			visit = new boolean[N][N];
			st = new StringTokenizer(in.readLine());
			starty = Integer.parseInt(st.nextToken());
			startx = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			endy = Integer.parseInt(st.nextToken());
			endx = Integer.parseInt(st.nextToken());
			visit[starty][startx] = true;
			q= new LinkedList<>();
			q.offer(new point(starty,startx,0));
			ans = 0;
			bfs();
			System.out.println(ans);
			q.clear();
			
		}
	}
	private static void bfs() {
		while(!q.isEmpty()) {
			point po = q.poll();
			int x = po.x;
			int y = po.y;
			int cnt = po.cnt;
			
			if(x == endx && y ==endy) {
				ans = cnt;
				return;
			}
			for(int i = 0; i < 8; i++) {
				int newY = y+dy[i];
				int newX = x+dx[i];
				if(isRanged(newY,newX) && !visit[newY][newX]) {
					visit[newY][newX] =true;
					//System.out.println(newY+" "+newX+" "+cnt);
					q.add(new point(newY,newX,cnt+1));
				}
			}
		}
	}
	private static boolean isRanged(int newY, int newX) {
		if(newY>=0 && newY < N && newX>=0 && newX<N) {
			return true;
		}
		return false;
	}

}
