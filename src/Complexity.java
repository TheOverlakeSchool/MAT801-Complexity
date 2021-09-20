import java.time.Duration;
import java.time.Instant;

public class Complexity {
    public static void main(String[] args) {
        Summer summer = new Summer();
        Instant start = Instant.now();
        long sum1 = summer.sum1(1000000);
        Instant end = Instant.now();
        System.out.println(sum1);
        System.out.println("Elapsed Time: " + Duration.between(start, end));

        start = Instant.now();
        long sum2 = summer.sum2(1000000);
        end = Instant.now();
        System.out.println(sum2);
        System.out.println("Elapsed Time: " + Duration.between(start, end));

    }
}
