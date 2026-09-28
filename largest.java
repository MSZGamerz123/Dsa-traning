import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;

        while (n > 0) {
            int digit = n % 10;
            
            if (digit > m) {
                m = digit;
            }

            n = n / 10;
        }

        System.out.println("Largest digit: " + m);
       
       

      
    }
}