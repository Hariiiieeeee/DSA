import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StockBuySellMultipleTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        int totProfit = 0;

        for(int i=1; i<n; i++){
            if(arr.get(i) > arr.get(i-1)) totProfit += arr.get(i) - arr.get(i-1);
        }

        System.out.println(totProfit);

    }    
}
