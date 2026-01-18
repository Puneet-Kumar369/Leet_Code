class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int k:nums){
            if(k!=val){
                nums[index]=k;
                index++;
            }
        }
        return index;
    }
}