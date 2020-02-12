public class Application {

    public static void main(String[] args) {
        findAllFemale();
    }

    public static void findAllFemale() {
        for (Student student : Student.values()) {
            if (student.getGender().equals("Female")) {
                System.out.println(student);
            }
        }
    }

}
