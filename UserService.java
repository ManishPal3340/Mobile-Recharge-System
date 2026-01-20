package MobileRechargeSystem;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserService {

    public static void registerUser() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO users(mobile_no, name, balance) VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mobile);
            ps.setString(2, name);
            ps.setDouble(3, 0);

            ps.executeUpdate();
            System.out.println("✅ User Registered Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getUserIdByMobile(String mobile) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT user_id FROM users WHERE mobile_no=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mobile);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("user_id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
