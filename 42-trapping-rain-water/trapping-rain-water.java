/*
import java.util.*;
class Solution {
    public int trap(int[] height) {
        if(height.length==0){return 0;}
        int n=height.length;int res=0;
        for(int i=0;i<n;i++){
            int left_max=height[i];
            int right_max=height[i];
            for(int j=0;j<i;j++){
                left_max=Math.max(height[j],left_max);
            }
            for(int j=i+1;j<n;j++){
                right_max=Math.max(height[j],right_max);
        }
            res+=Math.min(left_max,right_max)-height[i];
    }
            return res;
}
}
*/
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int[] left_max = new int[n];
        int[] right_max = new int[n];
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(left_max[i], right_max[i]) - height[i];
        }
        return res;
    }
}