import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class uniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i: arr) set.add(i);

        // union of arrays
        for(int i: arr2) set.add(i);

        // completely remove the duplicate elements
        // for(int i: arr2){
        //     if(set.contains(i)){
        //         set.remove(i);
        //     }else{
        //         set.add(i);
        //     }
        // }

        // union of arrays
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<n && j<m){
            int el1 = arr[i];
            int el2 = arr2[j];

            if(el1 < el2){
                i++;
                if(res.size()!=0 && res.get(res.size()-1) != el1){
                    res.add(el1);
                }
            }else if(el2 < el1){
                j++;
                if(res.size()!=0 && res.get(res.size()-1) != el2){
                    res.add(el2);
                }
            }else{
                i++;
                j++;
                if(res.size()!=0 && res.get(res.size()-1) != el1){
                    res.add(el1);
                }
            }
            
        }

        for(int el: res) System.out.print(el + " ");



        // for(int i: set) System.out.print(i + " ");
        // System.out.println();
        // System.out.println(set.size());

    }
}
