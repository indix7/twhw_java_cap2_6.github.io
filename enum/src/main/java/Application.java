public class Application {

    public static void main(String[] args) {
        addStudent();
        findAllFemale();
    }

    public static void findAllFemale() {
        GenderEnum.Female.showStudentsInfo();
    }
    public static void addStudent() {
        GenderEnum.Male.addStudent("Bob");
        GenderEnum.Male.addStudent("Solider");
        GenderEnum.Female.addStudent("Linda");
        GenderEnum.Female.addStudent("Cindy");
    }

}
