import java.util.Scanner;
class WeeklyFoodCost 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int totalCost = (6 * X) + Y;
        System.out.println(totalCost);
        scanner.close();
    }
}