import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            int area = X * Y;
            int cost = area * 2;
            int maxWalls = Z / cost;
            
            System.out.println(maxWalls);
        }
    }
}
