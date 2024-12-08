import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (Y <= 2 * X) {
            System.out.println("METAL");
        } else {
            System.out.println("PLASTIC");
        }
        sc.close();
    }
}