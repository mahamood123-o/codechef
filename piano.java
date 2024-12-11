import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            int aCount = 0, bCount = 0;
            boolean isValid = true;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    aCount++;
                } else {
                    bCount++;
                }
                
                if (bCount > aCount) {
                    isValid = false;
                    break;
                }
            }
            
            if (aCount != bCount) {
                isValid = false;
            }
            
            System.out.println(isValid ? "yes" : "no");
        }
        
        sc.close();
    }
}