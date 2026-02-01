class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        for(int k:nums){
            if(k!=nums[idx-1]){
                nums[idx]=k;
                idx++;
            }
        }
        return idx;
    }
}