import record.Homework;
import record.Lesson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LessonDAO {

    public int addLesson(Lesson lesson) {
        int status = 0;

        try {
            Connection connection = DataBaseConnection.getConnection();
            PreparedStatement ps = connection.
                    prepareStatement("INSERT INTO lesson (id, name, homework_id) VALUES (?,?,?)");
            ps.setInt(1, lesson.getId());
            ps.setString(2, lesson.getName());
            ps.setInt(3, lesson.getHomework_id());

            status = ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return status;
    }


    public int deleteLesson(int id) {
        int status = 0;

        try {
            Connection connection = DataBaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM lesson WHERE id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return status;
    }

    public List<Lesson> selectAll() {

        List<Lesson> list = new ArrayList<>();
        try {
            Connection connection = DataBaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM lesson");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Lesson(rs.getInt(1), rs.getString(2), rs.getInt(4)));
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return list;
    }


    public Lesson selectByID(int id) {
        Lesson lesson = new Lesson();
        try {
            Connection connection = DataBaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM lesson WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lesson.setId(rs.getInt(1));
                lesson.setName(rs.getString(2));
                lesson.setHomework_id(rs.getInt(4));
                connection.close();
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return lesson;
    }


}
