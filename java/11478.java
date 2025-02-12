import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();
        int answer = 0;
        String ary[] = new String[s.length()];

        for(int i = 0; i < s.length(); i++)
            ary[i] = s.substring(i);

        Arrays.sort(ary);
        answer += ary[0].length();

        for(int i = 1; i < ary.length; i++)
            answer += (ary[i].length() - getCommon(ary[i - 1], ary[i]));

        System.out.println(answer);
    }

    private static int getCommon(String s1, String s2){

        int result = 0;

        for(int i = 0; i < s1.length(); i++){
            if(i > s2.length()) break;
            if(s1.charAt(i) == s2.charAt(i)) result++;
            else break;
        }

        return result;
    }
}
