import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int N,tmp,Max,Min;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        scan.nextLine();
        
        String list[] = scan.nextLine().split(" ");
        
        Max = Min = Integer.parseInt(list[0]);
        for(int i =0; i < N; i++){
            tmp = Integer.parseInt(list[i]);
            if(tmp > Max)
                Max = tmp;
            else if(tmp < Min)
                Min = tmp;
        }
        System.out.println(Min+" "+ Max);
    }
}
