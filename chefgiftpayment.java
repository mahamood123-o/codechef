import java.util.Scanner;

public class chefgiftpayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (B >= A) {
            System.out.println(0);
        } else {
            System.out.println(A - B);
        }
        
        scanner.lose();
    }
}