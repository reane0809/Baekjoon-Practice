import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] intArr = new int[Integer.parseInt(br.readLine())];
    StringTokenizer st = new StringTokenizer(br.readLine());

    double[] dArr = new double[intArr.length];
    double m = 0;
    for(int i=0;i<intArr.length;i++){
      intArr[i] = Integer.parseInt(st.nextToken());
      dArr[i] = intArr[i];
      if(intArr[i]>m){
        m = intArr[i];
      }
    }    

    double total = 0;
    for(int i=0;i<dArr.length;i++){
      dArr[i] = dArr[i]/m*100;
      total = total + dArr[i];
    }

    bw.write(Math.round(total/intArr.length*100)*0.01+"\n");
  

    bw.flush();
    br.close();
    bw.close();
  }
}
