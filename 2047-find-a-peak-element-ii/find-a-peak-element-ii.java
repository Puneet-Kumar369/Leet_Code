class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int left=0;
        int right=mat.length-1;
        int col=mat[0].length;
        while(left<right){
            int mid=(left+right)>>1;
            int j=maxIndex(mat[mid]);
            if(mat[mid][j]>mat[mid+1][j]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return new int[]{left,maxIndex(mat[left])};
    }
    public int maxIndex(int [] arr){
        int idx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[idx]){
                idx=i;
            }
        }
        return idx;
    }
}