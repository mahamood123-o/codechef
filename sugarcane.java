import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int totalIncome = N * 50;
            int expenses = (20 * totalIncome) / 100 + (20 * totalIncome) / 100 + (30 * totalIncome) / 100;
            int profit = totalIncome - expenses;
            System.out.println(profit);
        }
    }
}
