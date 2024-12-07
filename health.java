import java.util.Scanner;
class SleepSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        
        if (H < 8) {
            System.out.println("LESS");
        } else if (H == 8) {
            System.out.println("PERFECT");
        } else {
            System.out.println("MORE");
        }
        
        scanner.close();
    }
}

