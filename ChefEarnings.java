import java.util.Scanner;
class ChefEarnings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int totalMoney = (X * 5000) + (Y * 9800);
        System.out.println(totalMoney);
        sc.close();
    }
}
