/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Course;

/**
 *
 * @author Admin
 */
public class CourseDAO extends DBContext {

    public List<Course> getAll() {
        String sql = "select * from Course";
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Course(rs.getString("course_id"), rs.getString("course_name"),
                        rs.getString("course_title"), rs.getString("course_img"),
                        rs.getDouble("course_price"), rs.getString("course_desc"),
                        rs.getString("course_start"), rs.getString("course_stop"),
                        rs.getString("course_public"), rs.getInt("sub_id"),
                        rs.getInt("lecturer_id"), rs.getInt("level_id"), rs.getBoolean("course_status")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Course getCourseById(String cid){
        String sql = "select * from Course where course_id like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, cid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Course(rs.getString("course_id"), rs.getString("course_name"),
                        rs.getString("course_title"), rs.getString("course_img"),
                        rs.getDouble("course_price"), rs.getString("course_desc"),
                        rs.getString("course_start"), rs.getString("course_stop"),
                        rs.getString("course_public"), rs.getInt("sub_id"),
                        rs.getInt("lecturer_id"), rs.getInt("level_id"), rs.getBoolean("course_status"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public double getMaxPrice() {
        String sql = "select MAX(course_price) from Course";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Course> getCourseByFilter(String subject, String level, String lecturer, String price, String cpublic, String search, int index) {
        String sql = "select * from Course where 1=1";
        if (search != null) {
            System.out.println(search);
            sql += " and (course_name like '%" + search + "%' or course_id like '%" + search + "%')";
        }
        if (subject != null && !subject.equals("0")) {
            sql += " and sub_id = " + subject;
        }
        if (level != null && !level.equals("0")) {
            sql += " and level_id = " + level;
        }
        if (lecturer != null && !lecturer.equals("0")) {
            sql += " and lecturer_id = " + lecturer;
        }
        if (price != null && price.equals("free")) {
            sql += " and course_price = 0";
        } else {
            if (price != null && !price.equals("all")) {
                sql += " and course_price between " + price;
            }
        }
        if (cpublic != null && !cpublic.equals("0")) {
            sql += " order by course_public " + cpublic;
        } else {
            sql += " order by course_id";
        }
        sql += " offset " + (index - 1) * 4 + " rows fetch next 4 rows only";
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Course(rs.getString("course_id"), rs.getString("course_name"),
                        rs.getString("course_title"), rs.getString("course_img"),
                        rs.getDouble("course_price"), rs.getString("course_desc"),
                        rs.getString("course_start"), rs.getString("course_stop"),
                        rs.getString("course_public"), rs.getInt("sub_id"),
                        rs.getInt("lecturer_id"), rs.getInt("level_id"), rs.getBoolean("course_status")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getCourseNumber(String subject, String level, String lecturer, String price, String search) {
        String sql = "select COUNT(*) from Course where 1=1";
        if (search != null) {
            sql += " and (course_name like '%" + search + "%' or course_id like '%" + search + "%')";
        }
        if (subject != null && !subject.equals("0")) {
            sql += " and sub_id = " + subject;
        }
        if (level != null && !level.equals("0")) {
            sql += " and level_id = " + level;
        }
        if (lecturer != null && !lecturer.equals("0")) {
            sql += " and lecturer_id = " + lecturer;
        }
        if (price != null && price.equals("free")) {
            sql += " and course_price = 0";
        } else {
            if (price != null && !price.equals("all")) {
                sql += " and course_price between " + price;
            }
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
     public List<Course> getTop4FreeCourse() {
        String sql = "select top 4* from Course where course_price = 0 order by course_name";
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                list.add(new Course(rs.getString("0"), rs.getString("1"),
//                        rs.getString("2"), rs.getString("3"),
//                        rs.getDouble("4"), rs.getString("5"),
//                        rs.getString("6"), rs.getString("7"),
//                        rs.getString("8"), rs.getInt("9"),
//                        rs.getInt("10"), rs.getInt("11")));
                list.add(new Course(rs.getString("course_id"), rs.getString("course_name"),
                        rs.getString("course_title"), rs.getString("course_img"),
                        rs.getDouble("course_price"), rs.getString("course_desc"),
                        rs.getString("course_start"), rs.getString("course_stop"),
                        rs.getString("course_public"), rs.getInt("sub_id"),
                        rs.getInt("lecturer_id"), rs.getInt("level_id"), rs.getBoolean("course_status")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Course> getTop4FeeCourse() {
        String sql = "select top 4* from Course where course_price > 0 order by course_price desc";
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Course(rs.getString("course_id"), rs.getString("course_name"),
                        rs.getString("course_title"), rs.getString("course_img"),
                        rs.getDouble("course_price"), rs.getString("course_desc"),
                        rs.getString("course_start"), rs.getString("course_stop"),
                        rs.getString("course_public"), rs.getInt("sub_id"),
                        rs.getInt("lecturer_id"), rs.getInt("level_id"), rs.getBoolean("course_status")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public static void main(String[] args) {
        CourseDAO cd = new CourseDAO();
        System.out.println(cd.getCourseById("CP"));
    }
}
