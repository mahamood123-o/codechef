import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                int difficulty = sc.nextInt();
                if (difficulty >= 1000) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}