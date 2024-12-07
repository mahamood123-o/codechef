import java.util.Scanner;
class SuryaNamaskar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int rounds = N / 12;
        System.out.println(rounds);
        scanner.close();
    }
}