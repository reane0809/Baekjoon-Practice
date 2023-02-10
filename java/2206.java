import java.util.*;
import java.io.*;

class Main{
    static char[][] map;
    static int N, M;
    static int[] dr = {-1,0,1,0}, dc = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        for(int i=0; i<N; i++) map[i] = br.readLine().toCharArray();

        if(N==1&&M==1) bw.write("1");
        else bw.write(Integer.toString(BFS()));

        bw.close();
        br.close();
    }

    static int BFS(){
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][][] visited = new boolean[2][N][M];       //맵크기, 벽 깼을떄 안깼을떄 방문 비교
        q.add(new int[]{0,0,1,1});                          //시작점, 벽꺤횟수, 시작부터 1이므로
        visited[0][0][0] = true;
        while(!q.isEmpty()){
            int[] n = q.poll();
            for(int i=0; i<4; i++){
                int nr = n[0] + dr[i];
                int nc = n[1] + dc[i];

                if(nr==N-1 && nc==M-1) return n[3]+1;           //도착점 도착시 반환 후 종료
                if(nr>=N||nr<0||nc>=M||nc<0||visited[n[2]][nr][nc]) continue;          //배열 밖, 이미 이동했던 곳 스킵

                if(map[nr][nc] == '1'&& n[2]==1){               //벽 한번도 안깼을경우
                    visited[0][nr][nc] = true;
                    q.add(new int[]{nr,nc,0,n[3]+1});
                }
                else if(map[nr][nc] != '1'){
                    visited[n[2]][nr][nc] = true;
                    q.add(new int[]{nr,nc,n[2],n[3]+1});
                }
            }
        }
        return -1;
    }
}
