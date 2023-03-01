import java.io.*;
import java.util.*;

public class Main {

    static class Node implements Comparable<Node>{
    	int to, weight;
    	
    	public Node(int to, int weight){
    		this.to = to;
    		this.weight = weight;
    	}
    	
    	@Override
    	public int compareTo(Node o) {
    		return weight - o.weight;
    	}
    }
	
    static int N;
    static int E;
    static int start;
    static ArrayList<ArrayList<Node>> list;
    static int[] dist;


    public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
        N = read();
        E = read();
        start = read()-1;
        
        list = new ArrayList<ArrayList<Node>>();
        for(int i=0; i<N; i++) {
        	list.add(new ArrayList<Node>());
        }
        dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // 리스트에 그래프 정보를 초기화
        for(int i = 0 ; i < E; i++){
            int start = read()-1;
            int to = read()-1;
            int weight = read();
            // start에서 end로 가는 weight 가중치
            list.get(start).add(new Node(to, weight));
        }

        // 다익스트라 알고리즘
        dijkstra(start);
        
        // 출력 부분
        for(int i = 0; i < N; i++){
            if(dist[i] == Integer.MAX_VALUE) sb.append("INF\n");
            else sb.append(dist[i]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13) System.in.read();
        return n;
    }

    private static void dijkstra(int start){
       PriorityQueue<Node> pque = new PriorityQueue<>();
       boolean[] visited = new boolean[N];
       pque.add(new Node(start, 0));  //start 까지의 비용은 0 => to=1,w=0인 노드 
       dist[start] = 0;//start 까지의 비용은 0

       while(!pque.isEmpty()){
           Node curNode = pque.poll();
           int cur = curNode.to;

           if(visited[cur]) continue; //이전에 방문 확정된 노드는 돌아 보지 않는다.
           visited[cur] = true;

           for(Node node : list.get(cur)){ //cur 와 연결된 노드를 모두 확인한다.
               if(dist[node.to] > dist[cur] + node.weight){
                   dist[node.to] = dist[cur] + node.weight; //연결된 정점으로 가는 비용 D에 작은비용으로 업데이트 
                   pque.add(new Node(node.to, dist[node.to]));
               }
           }
       }
    }
}
