import java.util.Scanner;
class cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 12) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}