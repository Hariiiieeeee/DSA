import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

                
        int sum = 0;
        while(!arr.isEmpty()){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;

            for(int i=0; i<arr.size(); i++){
                if(arr.get(i) < min){
                    min = arr.get(i);
                    minIdx = i;
                }
            }

            sum += min;

            if((0 < minIdx) && (minIdx < arr.size()-1)){
                arr.remove(minIdx);
                arr.remove(minIdx-1);
                arr.remove(minIdx);
            }

            else if(minIdx == 0){
                if(arr.size() != 1) arr.remove(minIdx+1);

                arr.remove(minIdx);
            }

            else if(minIdx == arr.size()-1){
                if(arr.size() != 1){
                    arr.remove(minIdx-1);
                }
                arr.remove(minIdx-1);
            }
        }

        System.out.println(sum);
    }
}
