import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A > B && A > C) {
                System.out.println("Alice");
            } else if (B > A && B > C) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
        sc.close();
    }
}