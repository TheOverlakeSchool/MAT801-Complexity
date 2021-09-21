public class MaxSubsequence {
    public int maxSum(int[] sequence) {
        int max = 0;
        for (int i = 0; i < sequence.length; i++) {
            for (int j = i; j < sequence.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += sequence[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public int maxSum2(int[] sequence) {
        int max = 0;
        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            for (int j = i; j < sequence.length; j++) {
                sum += sequence[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
