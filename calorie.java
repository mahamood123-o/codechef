import java.util.Scanner;
class CalorieIntake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        
        int totalCaloriesConsumed = Y * Z;
        
        if (totalCaloriesConsumed > X) {
            System.out.println(-1);
        } else {
            int remainingCalories = X - totalCaloriesConsumed;
            System.out.println(remainingCalories);
        }
        
        scanner.close();
    }
}


