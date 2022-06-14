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
import model.Post;

/**
 *
 * @author ADMIN
 */
public class PostDAO extends DBContext {

    public List<Post> getPost() {
        String sql = "select post_id,post_img,post_title,post_desc,post_date,post_status,p.blog_id from Post p \n"
                + "inner join Blog b on p.blog_id=b.blog_id\n"
                + "order by post_date desc";
        List<Post> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPoid(rs.getInt(1));
                p.setPoimg(rs.getString(2));
                p.setPotitle(rs.getString(3));
                p.setPodesc(rs.getString(4));
                p.setPodate(rs.getString(5));
                p.setPostatus(rs.getBoolean(6));
                p.setBid(rs.getInt(7));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Post> getTop3Post() {
        String sql = "select top 3 post_id,post_img,post_title,post_desc,post_date,post_status,p.blog_id from Post p \n"
                + "inner join Blog b on p.blog_id=b.blog_id\n"
                + "order by post_date desc";
        List<Post> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPoid(rs.getInt(1));
                p.setPoimg(rs.getString(2));
                p.setPotitle(rs.getString(3));
                p.setPodesc(rs.getString(4));
                p.setPodate(rs.getString(5));
                p.setPostatus(rs.getBoolean(6));
                p.setBid(rs.getInt(7));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Post> getTop4Post(String status) {
        String sql;
        if (status.equals("early")) {
            sql = "select top 4 post_id\n"
                + ",post_img\n"
                + ",post_title\n"
                + ",post_desc\n"
                + ",post_date\n"
                + ",post_status\n"
                + ",blog_id\n"
                + "from Post order by post_date asc";
        }
        else {
            sql = "select top 4 post_id\n"
                + ",post_img\n"
                + ",post_title\n"
                + ",post_desc\n"
                + ",post_date\n"
                + ",post_status\n"
                + ",blog_id\n"
                + "from Post order by post_date desc";
        }
        List<Post> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPoid(rs.getInt(1));
                p.setPoimg(rs.getString(2));
                p.setPotitle(rs.getString(3));
                p.setPodesc(rs.getString(4));
                p.setPodate(rs.getString(5));
                p.setPostatus(rs.getBoolean(6));
                p.setBid(rs.getInt(7));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Post> getTop3PostRelate(int id, int bid) {
        String sql = "select top 3 post_id,post_img,post_title,post_desc,post_date,post_status,p.blog_id from Post p \n"
                + "inner join Blog b on p.blog_id=b.blog_id\n"
                + "where p.blog_id=? and post_id!=?\n"
                + "order by post_date desc";
        List<Post> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, bid);
            st.setInt(2, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPoid(rs.getInt(1));
                p.setPoimg(rs.getString(2));
                p.setPotitle(rs.getString(3));
                p.setPodesc(rs.getString(4));
                p.setPodate(rs.getString(5));
                p.setPostatus(rs.getBoolean(6));
                p.setBid(rs.getInt(7));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Post> getPostByBlogID(int bid) {
        String sql = "select post_id,post_img,post_title,post_desc,post_date,post_status,p.blog_id from Post p \n"
                + "inner join Blog b on p.blog_id=b.blog_id\n"
                + "where p.blog_id=? \n"
                + "order by post_date desc";
        List<Post> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, bid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPoid(rs.getInt(1));
                p.setPoimg(rs.getString(2));
                p.setPotitle(rs.getString(3));
                p.setPodesc(rs.getString(4));
                p.setPodate(rs.getString(5));
                p.setPostatus(rs.getBoolean(6));
                p.setBid(rs.getInt(7));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Post getPostByID(int id) {
        String sql = "select post_id,post_img,post_title,post_desc,post_date,post_status,p.blog_id from Post p \n"
                + "inner join Blog b on p.blog_id=b.blog_id\n"
                + "where post_id = ?\n"
                + "order by post_date desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Post> getListByPage(List<Post> list,
            int start, int end) {
        ArrayList<Post> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public List<Post> searchPost(String key) {
        List<Post> list = new ArrayList<>();
        String sql = "select * from Post where post_title like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + key + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPoid(rs.getInt(1));
                p.setPoimg(rs.getString(2));
                p.setPotitle(rs.getString(3));
                p.setPodesc(rs.getString(4));
                p.setPodate(rs.getString(5));
                p.setPostatus(rs.getBoolean(6));
                p.setBid(rs.getInt(7));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

}
