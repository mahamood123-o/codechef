import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int fine = (P - Q) * X;
            System.out.println(fine);
        }
        sc.close();
    }
}