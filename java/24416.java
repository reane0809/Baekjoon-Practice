import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br;

    static String[] input;
    static StringBuffer sb = new StringBuffer(1024 * 1024);

    static void write(String str) {
        sb.append(str);
    }

    static void writeln(String str) {
        sb.append(str + "\n");
    }

    static int N;

    static int count1;
    static int count2;

    static int fib(int n) {
        if(n == 1 || n == 2) {
            count1++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int[] f;

    static int fibonacci(int n) {
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            count2++;
        }
        return f[n];
    }

    static void solveCase() throws IOException {
        f = new int[41];
        N = Integer.parseInt(br.readLine());
        fib(N);
        fibonacci(N);
        System.out.println(count1 + " " + count2);
    }

    public static void main(String[] args) {
        try {
            br = new BufferedReader(new InputStreamReader(System.in), 4 * 1024 * 1024);
            int caseCount = 1;//Integer.parseInt(br.readLine());
            for (int i = 0; i < caseCount; i++) {
                solveCase();
            }
            System.out.print(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
