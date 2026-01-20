package MobileRechargeSystem;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RechargeService {

    public static void doRecharge() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            int userId = UserService.getUserIdByMobile(mobile);

            if (userId == -1) {
                System.out.println("❌ Mobile number not registered");
                return;
            }

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            Connection con = DBConnection.getConnection();

            // update balance
            String updateSql = "UPDATE users SET balance = balance + ? WHERE user_id=?";
            PreparedStatement ps1 = con.prepareStatement(updateSql);
            ps1.setDouble(1, amount);
            ps1.setInt(2, userId);
            ps1.executeUpdate();

            // insert recharge history
            String insertSql = "INSERT INTO recharges(user_id, amount) VALUES (?,?)";
            PreparedStatement ps2 = con.prepareStatement(insertSql);
            ps2.setInt(1, userId);
            ps2.setDouble(2, amount);
            ps2.executeUpdate();

            System.out.println("✅ Recharge Successful: ₹" + amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
