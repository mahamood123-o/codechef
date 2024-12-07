import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int finalRent = 2 * X;
        System.out.println(finalRent);
        scanner.close();
    }
}