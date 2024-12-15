import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weapons = new int[N];
        
        int luckyCount = 0;
        int unluckyCount = 0;
        
        for (int i = 0; i < N; i++) {
            weapons[i] = sc.nextInt();
            if (weapons[i] % 2 == 0) {
                luckyCount++;
            } else {
                unluckyCount++;
            }
        }
        
        if (luckyCount > unluckyCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}
