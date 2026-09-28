import java.util.Scanner;
public class watermealon {
    public static void main(String[] args) {
        
  Scanner x = new Scanner(System.in);
    int weight = x.nextInt();
    if (weight % 2 == 0 && weight > 2) {
        System.out.println("YES");
    } else if (weight < 0 ) {
        System.out.println("Not Possible");
        
        }else {
        System.out.println("NO");
    }
}
}