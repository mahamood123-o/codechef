import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X < Y) {
                System.out.println("REPAIR");
            } else if (X > Y) {
                System.out.println("NEW PHONE");
            } else {
                System.out.println("ANY");
            }
        }
        
        sc.close();
    }
}
