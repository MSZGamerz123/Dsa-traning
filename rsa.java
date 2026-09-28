import java.util.*;
public class rsa {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int m = x * y;
        

        int e = 3;
        int d = 7;
        int msg = 2;

        int encrypted = (int) (Math.pow(msg , e) % m);
        int decrypted = (int) (Math.pow(encrypted , d) %m);

        System.out.println("Public key " + e +" , "+ m );
        System.out.println("Private key " + d +" , "+ m );
        System.out.println("Original Message "+ msg  );
        System.out.println("Encryption "+ encrypted );
        System.out.println("Decryption " + decrypted); 


    }

}