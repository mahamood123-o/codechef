import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            
            int correct = 0;
            int incorrect = 0;
            int unattempted = 0;
            
            for (correct = 0; correct <= 100; correct++) {
                int score = correct * 3;
                if (score > X) {
                    break;
                }
                int remainingScore = X - score;
                if (remainingScore >= 0 && remainingScore % -1 == 0) {
                    incorrect = remainingScore;
                    unattempted = 100 - correct - incorrect;
                    break;
                }
            }
            
            System.out.println(incorrect);
        }
    }
}
