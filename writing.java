import java.util.Scanner;
class writing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        
        if (5 * X <= 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}