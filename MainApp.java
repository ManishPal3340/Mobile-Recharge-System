package MobileRechargeSystem;


import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📱 Mobile Recharge System 📱");
            System.out.println("1. Register User");
            System.out.println("2. Recharge Mobile");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    UserService.registerUser();
                    break;
                case 2:
                    RechargeService.doRecharge();
                    break;
                case 3:
                    System.out.println("🙏 Thank You");
                    break;
                default:
                    System.out.println("❌ Invalid Choice");
            }

        } while (choice != 3);
    }
}
