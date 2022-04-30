import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int cnt = 0;
	static int[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nodeNum = Integer.parseInt(br.readLine());
		int edgeNum = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] arr = new ArrayList[nodeNum+1];
		visited = new int[nodeNum+1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		StringTokenizer st;
		
		for(int i=0; i<edgeNum; i++) {
			st= new StringTokenizer(br.readLine());
			int com1 = Integer.parseInt(st.nextToken());
			int com2 = Integer.parseInt(st.nextToken());
			arr[com1].add(com2);
			arr[com2].add(com1);
		}
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"] : ");
			for(int j=0; j<arr[i].size(); j++) {
				System.out.print(arr[i].get(j)+" ");
			}
			System.out.println("");
		}
		*/
		visited[1] = 1;
		dfs(arr, 1);
		
		System.out.print(cnt);
	}
	
	public static void dfs(ArrayList<Integer>[] arr, int current) {
		int next = 0;
		for(int i=0; i<arr[current].size(); i++) {
			next = arr[current].get(i);
			if(visited[next]==0) {
				visited[next]=1;
				cnt++;
				dfs(arr, next);
			}
		}
	}
}
