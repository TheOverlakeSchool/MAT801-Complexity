public class Summer {
    public long sum1(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public long sum2(long n) {
        return n * (n+1) / 2;
    }
}
