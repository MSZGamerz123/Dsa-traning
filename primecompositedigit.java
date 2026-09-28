import java.util.*;

public class primecompositedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prime = 0;
        int composite = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                prime++;
            }
            else if (digit == 4 || digit == 6 || digit == 8 || digit == 9) {
                composite++;
            }

            n = n / 10;
        }

        System.out.println("Prime digits: " + prime);
        System.out.println("Composite digits: " + composite);
    }
}