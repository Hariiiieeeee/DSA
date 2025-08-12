import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();


        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        int target = sc.nextInt();

        Collections.sort(arr);
        for(int i=0; i<n; i++){
            if(arr.get(i) == target) {
                res.add(Arrays.asList(arr.get(i)));
                continue;
            }


            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = arr.get(left) + arr.get(right) + arr.get(i);

                if(sum > target) right--;
                else if(sum < target) left++;
                else{
                    res.add(Arrays.asList(arr.get(i), arr.get(left), arr.get(right)));
                    left++;
                    right--;
                    
                }
            }
        }

        for(List<Integer> i : res) System.out.println(i);
    }
}
