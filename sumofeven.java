import java.util.*;
public class sumofeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;

        while (n > 0) {
            int digit = n % 10;
            
            if (digit % 2 == 0) {
                
                    m = digit + m;
                }
             n = n / 10;
            }

           
            System.out.println("Sum of even digits: " + m);
        }

        
}
       
       

      

