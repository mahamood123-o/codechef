import java.util.Scanner;
class MedalsForChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int G = scanner.nextInt();
        int S = scanner.nextInt();
        int B = scanner.nextInt();
        
        int additionalGold = Math.max(0, 5 - G);
        int additionalSilver = Math.max(0, 5 - S);
        int additionalBronze = Math.max(0, 5 - B);
        
        int totalAdditionalMedals = additionalGold + additionalSilver + additionalBronze;
        
        System.out.println(totalAdditionalMedals);
        
        scanner.close();
    }
}
