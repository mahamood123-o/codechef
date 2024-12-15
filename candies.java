import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int requiredCandies = N - X;
            if (requiredCandies <= 0) {
                System.out.println(0);
            } else {
                int packets = (requiredCandies + 3) / 4;
                System.out.println(packets);
            }
        }
    }
}
