import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if (X > 10 * Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
