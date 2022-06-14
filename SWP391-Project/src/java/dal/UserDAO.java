/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.DatatypeConverter;
import model.User;

/**
 *
 * @author Dell
 */
public class UserDAO extends DBContext {

    public List<User> getAll() {
        String sql = "select * from [User]";
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getInt("user_id"), rs.getString("user_email"),
                        rs.getString("password"), rs.getString("full_name"),
                        rs.getString("user_img"), rs.getInt("gender_id"), rs.getString("user_dob"),
                        rs.getString("user_phone"), rs.getString("user_address"),
                        rs.getString("user_wallet")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public User checkUser(String email) {
        String sql = "select * from [User] where user_email=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("user_id"), rs.getString("user_email"),
                        rs.getString("password"), rs.getString("full_name"),
                        rs.getString("user_img"), rs.getInt("gender_id"), rs.getString("user_dob"),
                        rs.getString("user_phone"), rs.getString("user_address"),
                        rs.getString("user_wallet"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    public User checkUser(String email, String pass) throws NoSuchAlgorithmException {
        String sql = "select * from [User] where user_email=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, email);
            st.setString(2, Encryption((pass)));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("user_id"), rs.getString("user_email"),
                        rs.getString("password"), rs.getString("full_name"),
                        rs.getString("user_img"), rs.getInt("gender_id"), rs.getString("user_dob"),
                        rs.getString("user_phone"), rs.getString("user_address"),
                        rs.getString("user_wallet"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    public String getRole(User u) {
        String sql = "select r.role_name from [User] u\n"
                + "join [User_Role] ur on u.user_id = ur.user_id\n"
                + "join [Role] r on ur.role_id = r.role_id\n"
                + "where u.user_id = " + u.getUid();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("role_name");
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public User getUserByUid(int uId) {
        //select * from [User] where user_id=1;
        String sql = "select * from [User] where user_id=" + uId;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("user_id"), rs.getString("user_email"),
                        rs.getString("password"), rs.getString("full_name"),
                        rs.getString("user_img"), rs.getInt("gender_id"),
                        rs.getString("user_dob"), rs.getString("user_phone"),
                        rs.getString("user_address"), rs.getString("user_wallet"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateUser(User u, int uid) {
        String sql = "update [User] "
                + "set user_email = ?, full_name = ?, user_img = ?, gender_id = ? , user_dob = ?, "
                + "user_phone = ?, user_address = ?, user_wallet= ? "
                + "where user_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, u.getUemail());
            st.setString(2, u.getUfullname());
            st.setString(3, u.getUimg());
            st.setInt(4, u.getGid());
            if (u.getUdob().equals("1900-01-01")) {
                st.setString(5, null);
            } else {
                st.setString(5, u.getUdob());
            }
            st.setString(6, u.getUphone());
            st.setString(7, u.getUaddress());
            st.setString(8, u.getUwallet());
            st.setInt(9, uid);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateNewPass(String email, String newpass) {
        String sql = "update [User] "
                + " set password = ?"
                + " where user_email = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newpass);
            st.setString(2, email);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateUserPassword(User u) {
        String sql = "Update [User] set [password] = ? where user_email like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, u.getUpassword());
            st.setString(2, u.getUemail());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String Encryption(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest);
        return myHash;
    }

    public void insertUser(User ca) throws NoSuchAlgorithmException {
        String sql = "insert into [User](user_email, password, full_name, gender_id, role_id) values(?,?,?,?,?)";
        try {
            String encrypt = Encryption(ca.getUpassword());
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ca.getUemail());
            st.setString(2, encrypt);
            st.setString(3, ca.getUfullname());
            st.setInt(4, ca.getGid());
            st.setInt(5, ca.getRid());
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
//            insertUser_Role();
    }

    public static void main(String[] args) {
        UserDAO cd = new UserDAO();
        User u = new User(1, "chieund@gmail.com", "123@123a", "Nguyen Danh Chieu", null, 0, null, null, null, null);
        System.out.println(cd.getRole(u));
//        for (User c : cd.getAll()) {
//            System.out.println(c);
//        }
    }
}
