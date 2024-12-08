import java.util.Scanner;
class credits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            int totalCredits = (X * 4) + (Y * 2);
            System.out.println(totalCredits);
        }
        
        scanner.close();
    }
}
