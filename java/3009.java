import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, NullPointerException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = null;
		
		int[] xPs = new int[3];
		int[] yPs = new int[3];
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			xPs[i] = Integer.parseInt(st.nextToken());
			yPs[i] = Integer.parseInt(st.nextToken());
		}
		
		sb.append(otherOne(xPs)).append(" ")
		.append(otherOne(yPs));
		
		

		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int otherOne(int[] arr) {
		int temp = 0;
		int i = 0;
		for(i=0; i<arr.length; i++)  {
			int count = 0;
			temp = arr[i];
			for(int j=0; j<arr.length; j++)
				if(temp == arr[j])
					count++;
			if(count==1)
				break;
		}
		return arr[i];
	}

}
