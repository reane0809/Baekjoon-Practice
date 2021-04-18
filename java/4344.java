import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N=0;
        int[] arr = new int[1000];
        double avg=0;
        for(int i =0 ; i < T ; i++)
        {
            N = scan.nextInt();
            int score = 0 ;
            int Pass=0;
            
            for(int j=0; j < N ; j++)
            {
                arr[j]=scan.nextInt();
                score+=arr[j];
            }
            
            avg = (double)score/N;
            for(int j=0; j < N ; j++)
            {
                if(arr[j]>avg)
                Pass++;
            }
            
            System.out.printf("%.3f", (float)Pass/N*100);
            System.out.println("%");
                
        }
    }
}
