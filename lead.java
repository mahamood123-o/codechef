import java.util.Scanner;
class BilliardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cumulativeScore1 = 0, cumulativeScore2 = 0, maxLead = 0, winner = 0;
        
        for (int i = 0; i < N; i++) {
            int Si = scanner.nextInt();
            int Ti = scanner.nextInt();
            
            cumulativeScore1 += Si;
            cumulativeScore2 += Ti;
            
            int lead = 0;
            int currentWinner = 0;
            
            if (cumulativeScore1 > cumulativeScore2) {
                lead = cumulativeScore1 - cumulativeScore2;
                currentWinner = 1;
            } else {
                lead = cumulativeScore2 - cumulativeScore1;
                currentWinner = 2;
            }
            
            if (lead > maxLead) {
                maxLead = lead;
                winner = currentWinner;
            }
        }
        
        System.out.println(winner + " " + maxLead);
        scanner.close();
    }
}
