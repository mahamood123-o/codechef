import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            
            if (A >= 10 && B >= 10 && C >= 10 && (A + B + C) >= 100) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        
        scanner.close();
    }
}
