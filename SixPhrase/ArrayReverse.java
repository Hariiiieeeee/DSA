import java.util.Scanner;

    class ArrayReverse{
        public static void main(String[] args) {
            Scanner s=new Scanner (System.in);
            
            int n = s.nextInt();
            int[] arr=new int[n];

            for (int idx = 0; idx < arr.length; idx++) {
                arr[idx] = s.nextInt();
                
            }
            int left=0;
            int right=n-1;
            
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);

            }

        }
    }