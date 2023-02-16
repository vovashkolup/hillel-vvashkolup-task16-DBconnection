package record;

public class Lesson {
    private int id;
    private String name;
    private int homework_id;

    public Lesson(int id, String name, int homework_id) {
        this.id = id;
        this.name = name;
        this.homework_id = homework_id;
    }

    public Lesson() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework_id=" + homework_id +
                '}';
    }

    public int getHomework_id() {
        return homework_id;
    }

    public void setHomework_id(int homework_id) {
        this.homework_id = homework_id;
    }

}
