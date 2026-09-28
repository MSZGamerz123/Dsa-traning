import java.util.*;
public class itm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x = n - arr[i];

            if (x > 3){
                System.out.println("Improvement Day");

            } else if (x < 3) {
                System.out.println("Not An Improvement Day");
            }
        }
    }
}