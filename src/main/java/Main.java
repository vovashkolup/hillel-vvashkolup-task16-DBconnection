
import record.Lesson;

public class Main {
    public static void main(String[] args) {
        LessonDAO dao = new LessonDAO();

////        Lesson lesson1 = new Lesson( "Biology", 1);
////        Lesson lesson2 = new Lesson("Geographic", 2);
////        Lesson lesson3 = new Lesson("History", 3);
//
//        dao.addLesson(lesson1);
//        dao.addLesson(lesson2);
//        dao.addLesson(lesson3);

//        dao.deleteLesson(1);


//        Lesson lesson4 = dao.selectByID(2);
////        System.out.println(lesson4);
//
        System.out.println(dao.selectAll());

    }
}
