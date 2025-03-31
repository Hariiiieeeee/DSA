class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int cnt1 = 0;
        int cnt2 = 0;

        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i : nums){
            if(cnt1 == 0 && i != el2){
                cnt1++;
                el1 = i;
            }

            else if(cnt2 == 0 && i != el1){
                cnt2++;
                el2 = i;
            }

            else if(i == el1) cnt1++;

            else if(i == el2) cnt2++;

            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int i : nums){
            if(i == el1) cnt1++;
            if(i == el2) cnt2++;
        }

        List<Integer> list = new ArrayList<>();

        if(cnt1 > n/3) list.add(el1);
        if(cnt2 > n/3) list.add(el2);

        return list;
    }
}