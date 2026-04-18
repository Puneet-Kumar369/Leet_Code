class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        int first_one = -1;
        //int var=true;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                first_one = i;
                break;
            }
        }
        for (int i = first_one + 1; i < len; i++) {
            if (nums[i] == 1) {
                if (count < k) {
                    return false;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return true;
    }
}
// 0101      k==2