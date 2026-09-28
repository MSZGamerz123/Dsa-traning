import java.util.*;
public class evenoddcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            n = n / 10;
        }

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}