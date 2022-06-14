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
import model.QuesResult;
import model.Question;

/**
 *
 * @author Admin
 */
public class QuestionDAO extends DBContext {

    public Question getQuestionById(String qid) {
        String sql = "select * from Question where ques_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(qid));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Question q = new Question();
                q.setQuesid(rs.getInt(1));
                q.setQcontent(rs.getString(2));
                q.setQresult(rs.getInt(3));
                q.setQnote(rs.getString(4));
                q.setQid(rs.getInt(5));
                return q;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public int getNumQuestionByQid(String qid) {
        String sql = "select count(*) from Question where quiz_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(qid));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return 0;
    }

    public void insertQuesAnswer(QuesResult quesr) {
        String sql = "INSERT INTO [dbo].[Ques_Result]([ques_id],[user_id],[ques_status],[ques_flag],[ques_answer],[quiz_result_id]) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, quesr.getQuesid());
            st.setInt(2, quesr.getUid());
            st.setBoolean(3, quesr.isQstatus());
            st.setBoolean(4, quesr.isQflag());
            st.setInt(5, quesr.getQanswer());
            st.setInt(6, quesr.getQrid());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Integer> getQuesResultByQuizId(String qid) {
        List<Integer> list = new ArrayList<>();
        String sql = "select ques_result from Question where quiz_id=" + qid;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new QuestionDAO().getQuestionById("1").getQcontent());
        System.out.println(new QuestionDAO().getNumQuestionByQid("1"));

        System.out.println(new QuestionDAO().getQuesResultByQuizId("1").toString());

    }
}
