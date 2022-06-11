package JPL0Lab12.part1;

public class Student {
    public Student(){};
    private int id;
    private String firstName;
    public Student( int id , String firstName){
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
