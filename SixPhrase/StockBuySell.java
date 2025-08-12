import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StockBuySell{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        int buy = arr.get(0);       
        int profit = 0;
        for(int i : arr){            
            profit = Math.max(profit, i-buy);
            buy = Math.min(i, buy);
        }

        System.out.println("profit : " + profit);
    }
}