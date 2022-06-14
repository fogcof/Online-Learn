/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Lecturer;

/**
 *
 * @author Admin
 */
public class LecturerDAO extends DBContext {

    public List<Lecturer> getAll() {
        String sql = "select * from Lecturer";
        List<Lecturer> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Lecturer(rs.getInt("lecturer_id"), rs.getString("lecturer_name")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
    }
}
