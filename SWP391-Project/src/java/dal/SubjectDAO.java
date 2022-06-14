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
import model.Subject;

/**
 *
 * @author Admin
 */
public class SubjectDAO extends DBContext{
    public List<Subject> getAll(){
        String sql = "select * from Subject";
        List<Subject> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Subject(rs.getInt("sub_id"), rs.getString("sub_name"), 
                        rs.getString("sub_img"), rs.getString("sub_desc"), rs.getInt("subject_cate_id")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        SubjectDAO sd=new SubjectDAO();
        System.out.println(sd.getAll().get(2).getSname());
    }
}
