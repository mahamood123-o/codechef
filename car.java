import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int cost = (X < 300) ? 300 * 10 : X * 10;
            System.out.println(cost);
        }
        sc.close();
    }
}