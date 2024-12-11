import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int R1 = sc.nextInt(), W1 = sc.nextInt(), C1 = sc.nextInt();
            int R2 = sc.nextInt(), W2 = sc.nextInt(), C2 = sc.nextInt();
            
            int countA = 0, countB = 0;
            
            if (R1 > R2) countA++;
            else countB++;
            
            if (W1 > W2) countA++;
            else countB++;
            
            if (C1 > C2) countA++;
            else countB++;
            
            if (countA > countB) System.out.println("A");
            else System.out.println("B");
        }
        
        sc.close();
    }
}


