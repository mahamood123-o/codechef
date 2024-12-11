import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
            
            for (int i = K + 1; i <= N; i++) {
                int originalDay = (i - 1) / 5 + 1;
                int newDay = (i - 2) / 5 + 1;
                
                if (originalDay != newDay) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
