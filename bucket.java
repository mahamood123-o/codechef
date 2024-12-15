import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            int totalWater = W + Y * Z;
            
            if (totalWater > X) {
                System.out.println("overflow");
            } else if (totalWater == X) {
                System.out.println("filled");
            } else {
                System.out.println("unfilled");
            }
        }
    }
}
