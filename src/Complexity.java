import java.time.Duration;
import java.time.Instant;

public class Complexity {
    public static void main(String[] args) {
//        Summer summer = new Summer();
//        Instant start = Instant.now();
//        long sum1 = summer.sum1(1000000);
//        Instant end = Instant.now();
//        System.out.println(sum1);
//        System.out.println("Elapsed Time: " + Duration.between(start, end));
//
//        start = Instant.now();
//        long sum2 = summer.sum2(1000000);
//        end = Instant.now();
//        System.out.println(sum2);
//        System.out.println("Elapsed Time: " + Duration.between(start, end));

//            Range range = new Range();
//            int[] nums = new int[]{17,29,11,4,20,8};
//        System.out.println(range.range1(nums));

        MaxSubsequence maxSubsequence = new MaxSubsequence();
        int[] nums = new int[]{2,1,-4,10,15,-2,22,-8,5};
        System.out.println(maxSubsequence.maxSum(nums));
    }
}
