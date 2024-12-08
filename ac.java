import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T > 30) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}