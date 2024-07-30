import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] words = s.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isBlank()) {
                count++;
            }

        }

        System.out.println(count);
        
    }
}
