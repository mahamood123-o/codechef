import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                int response = sc.nextInt();
                if (response == 1) {
                    count++;
                }
            }
            if (count >= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
