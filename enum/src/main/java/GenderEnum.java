import java.util.ArrayList;

public enum GenderEnum {
    Male, Female;
    private ArrayList<Student> students = new ArrayList<Student>();

    GenderEnum() {}

    GenderEnum(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(String name) {
        this.students.add(new Student(name, this.name()));
    }

    public void showStudentsInfo() {
        System.out.println("All of " + this.name() + "  :  ");
        for (Student student: students) {
            System.out.println(student);
        }
    }




}
