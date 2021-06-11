class Main {

    public static void main(String[] args) throws Exception {

        // DP 준비
        long[] D = new long[101];
        D[1] = D[2] = D[3] = 1;
        for (int i = 4; i < 101; i++)
            D[i] = D[i - 3] + D[i - 2];

        // TC 실행
        StringBuilder sb = new StringBuilder();
        for (int t = read(); t > 0; t--)
            sb.append(D[read()]).append('\n');

        // 결과 출력
        System.out.print(sb);

    }


    private static int read() throws Exception {
        int c, n = System.in.read() - 48;
        while ((c = System.in.read()) > 32) n = 10 * n + c - 48;
        return n;
    }

}
