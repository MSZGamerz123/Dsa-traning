import java.util.*;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int digit;
        int sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
            System.out.println(sum);
        }

        System.out.println("The sum of digits is: " + sum);

    }
}