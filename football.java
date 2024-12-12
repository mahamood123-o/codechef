import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X > Y) {
            System.out.println("FREEKICK");
        } else {
            System.out.println("PENALTY");
        }
        sc.close();
    }
}