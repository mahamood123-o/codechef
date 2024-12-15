import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W  =  sc.nextInt();
        int H  =  sc.nextInt();
        
        if (W <= 75 && H >= 130) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
