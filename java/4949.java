import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] stack = new char[100];
        int size;
        StringBuilder stringBuilder = new StringBuilder();
        for(char[] string = bufferedReader.readLine().toCharArray(); ; string = bufferedReader.readLine().toCharArray()) {
            if(string[0] == '.') {
                System.out.print(stringBuilder);
                break;
            }
            size = 0;
            for(int i = 0; i < string.length; i++) {
                if(string[i] == '(' || string[i] == '[') {
                    stack[size++] = string[i];
                } else if(string[i] == ')') {
                    if(size == 0 || stack[--size] != '(') {
                        size++;
                        break;
                    }
                } else if(string[i] == ']') {
                    if(size == 0 || stack[--size] != '[') {
                        size++;
                        break;
                    }
                }
            }
            if(size == 0) {
                stringBuilder.append("yes\n");
            } else {
                stringBuilder.append("no\n");
            }
        }
    }
}
