class Solution {
    public double trimMean(int[] arr) {
        int len = arr.length;
        int trim_len = (int) Math.round(len * (0.05));
        Arrays.sort(arr);
        double n = arr.length * (0.09);
        double sum = 0;
        for (int i = trim_len; i < len - trim_len; i++) {
            sum += arr[i];
        }

        return (n == 0) ? 0 : (sum / n) / 10;

    }
}