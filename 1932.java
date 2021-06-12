import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int floor = Integer.parseInt(bf.readLine());
		int triangle[][] = new int[floor][floor];
		
		for (int i = 0; i < floor; i++) {
			String[] str = bf.readLine().split(" ");
			for(int j=0; j<=i; j++)
			{
				triangle[i][j] = Integer.parseInt(str[j]);
			}
		}

		for(int i=floor-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(triangle[i][j]>=triangle[i][j+1])
					triangle[i-1][j] += triangle[i][j] ;
				else
					triangle[i-1][j] += triangle[i][j+1];
			}
		}

		System.out.println(triangle[0][0]);

	}
}
