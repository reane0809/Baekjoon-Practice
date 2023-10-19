import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Inputs
        String[] line = br.readLine().split(" ");
        int fixedCost = Integer.parseInt(line[0]);
        int costPerUnit = Integer.parseInt(line[1]);
        int sellPricePerUnit = Integer.parseInt(line[2]);
        int answer = -1;
        // Sell price should always be higher than cost per unit to make profit;
        if (sellPricePerUnit > costPerUnit) {
            int profitPerUnit = sellPricePerUnit - costPerUnit;
            answer = (fixedCost / profitPerUnit) + 1;
        }
        System.out.println(answer);
    }
}
