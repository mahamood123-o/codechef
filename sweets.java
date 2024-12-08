import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        
        int remainingMoney = X - 10 * N;
        int jalebis = remainingMoney / 20;
        
        System.out.println(jalebis);
    }
}
