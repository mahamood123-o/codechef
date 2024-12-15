import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int totalBill = N * X;
            if (totalBill >= 10000 && totalBill <= 99999) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
