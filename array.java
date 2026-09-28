import java.util.*;

public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

   
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 System.out.println("Enter the elements to find: ");
   int x =  sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                System.out.println("Element found at index: " + i);
            }
        }

    for ( int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("The largest element is: " + arr[i]);
                break;
            
            }
     
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println("The smallest element is: " + arr[i]);
                break;
            }
        }
    }
}