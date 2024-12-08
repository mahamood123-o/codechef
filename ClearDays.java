import java.util.Scanner;
class ClearDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int clearDays = 7 - (X + Y);
        System.out.println(clearDays);
        scanner.close();
    }
}