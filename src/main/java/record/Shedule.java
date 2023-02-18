package record;

import java.util.ArrayList;

public class Shedule {
    private int id;
    private String name;

    private String updatedAt;
    private ArrayList <Lesson> lessons;

    public Shedule(String name, String updatedAt, ArrayList<Lesson> lessons) {
        this.name = name;
        this.updatedAt = updatedAt;
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", lessons=" + lessons +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }
}
