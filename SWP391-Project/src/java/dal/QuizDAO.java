/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Quiz;
import model.QuizResult;

/**
 *
 * @author ADMIN
 */
public class QuizDAO extends DBContext {

    public List<Quiz> GetListQuizByCID(String cid) {
        String sql = "select * from Quiz where course_id like ? ";
        List<Quiz> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, cid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Quiz q = new Quiz();
                q.setQid(rs.getInt(1));
                q.setQname(rs.getString(2));
                q.setQdesc(rs.getString(3));
                q.setCid(rs.getString(4));
                q.setTid(rs.getInt(5));
                q.setSid(rs.getInt(6));
                list.add(q);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public Quiz getQuizById(String qid) {
        String sql = "select * from Quiz where quiz_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(qid));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Quiz q = new Quiz();
                q.setQid(rs.getInt(1));
                q.setQname(rs.getString(2));
                q.setQdesc(rs.getString(3));
                q.setCid(rs.getString(4));
                q.setTid(rs.getInt(5));
                q.setSid(rs.getInt(6));
                return q;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void insertQuizResult(QuizResult qr) {
        String sql = "INSERT INTO [dbo].[Quiz_Result] ([quiz_id],[user_id],[quiz_status],[quiz_grade],[quiz_start],[quiz_end]) \n"
                + "VALUES(?, ?, ?, ?, CAST(? AS DateTime), GETDATE())";

//        int qrid;
//        int qid;
//        int uid;
//        boolean qstatus;
//        double qgrade;
//        String qstart;
//        String qend;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, qr.getQid());
            st.setInt(2, qr.getUid());
            st.setBoolean(3, qr.isQstatus());
            st.setDouble(4, qr.getQgrade());
            st.setString(5, qr.getQstart());

            st.executeUpdate();
        } catch (Exception e) {
        }

    }

    public int countQuizResult() {
        String sql = "select count(*) from Quiz_Result";
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

    public static void main(String[] args) {
        DateFormat obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(obj.format(new Date().getTime()));

//        new QuizDAO().insertQuizResult(new QuizResult(0, 1, 1, true, 8, , '1'));
    }

}
