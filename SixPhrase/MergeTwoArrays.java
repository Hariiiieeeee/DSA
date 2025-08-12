import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MergeTwoArrays{
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,8, 4, 3, 0));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 0));

        int n = arr1.size();
        int m = arr2.size();

        Collections.sort(arr1);
        Collections.sort(arr2);

        // for(int i: arr1) System.out.print(i + " ");
        // System.out.println();
        // for(int i: arr2) System.out.print(i + " ");
        // System.out.println();
        
        List<Integer> res = new ArrayList<>();
        
        int i=0;
        int j=0;

        while(i<n && j<m){
            if(arr1.get(i) < arr2.get(j)){
                res.add(arr1.get(i));
                // System.out.print(arr1.get(i) + " ");
                i++;
            }
            else if(arr2.get(j) < arr1.get(i)){
                res.add(arr2.get(j));
                // System.out.print(arr2.get(j) + " ");
                j++;
            }
            else{
                res.add(arr1.get(i));
                res.add(arr2.get(j));
                // System.out.print(arr1.get(i) + " ");
                // System.out.print(arr2.get(j) + " ");
                i++;
                j++;
            }
        }

        

        while(i < n){
            res.add(arr1.get(i));
            i++;
        }

        while(j < m){
            res.add(arr2.get(j));
            j++;
        }

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}