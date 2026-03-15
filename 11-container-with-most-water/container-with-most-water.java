class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0, rightPointer = height.length - 1, max_area = 0;
        while (leftPointer < rightPointer) {
            int width = rightPointer - leftPointer;
            int high = Math.min(height[leftPointer], height[rightPointer]);
            max_area = Math.max(max_area, width * high);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return max_area;

    }
}