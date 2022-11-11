import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), r = 0, i = 0;
    int[] ar = new int[n];
    StringTokenizer token = new StringTokenizer(br.readLine(), " ");
    while (token.hasMoreTokens()) {
      ar[i] = Integer.parseInt(token.nextToken());
      i++;
    }
    int v = Integer.parseInt(br.readLine());
    for (int j : ar) {
      if (j == v) {
        r++;
      }
    }
    System.out.println(r);
  }
}
