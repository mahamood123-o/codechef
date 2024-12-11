import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int aMod = A % 3;
            int bMod = B % 3;
            
            if (aMod == 0 || bMod == 0) {
                System.out.println(0);
            } else if (aMod == bMod) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
        sc.close();
    }
}