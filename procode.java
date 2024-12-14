import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if (M >= (N + 1) / 2) {
            System.out.println("NEWBIE");
        } else {
            System.out.println("PRO");
        }
        
        sc.close();
    }
}
