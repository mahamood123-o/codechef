import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int totalTyres = (N * 2) + (M * 4);
            System.out.println(totalTyres);
        }
        
        sc.close();
    }
}
