import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int newSellingPrice = X + (X / 10);
            int newProfit = (newSellingPrice * Y) / X;
            System.out.println(newProfit);
        }
    }
}
