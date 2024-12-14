import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            int totalMinutesRequired = X * Y;
            int availableMinutes = Z * 24 * 60;
            
            if (totalMinutesRequired <= availableMinutes) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
