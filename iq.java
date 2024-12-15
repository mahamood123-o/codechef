import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        if (X + 7 > 170) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
