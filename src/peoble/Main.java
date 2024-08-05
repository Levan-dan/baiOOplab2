package peoble;

public class Main {
    public static void main(String[] args) {
        PeopleIMPL student = new PeopleIMPL("Hang", 18, true);
        System.out.println(student.getAge() + student.eat());
        System.out.println(student.sleep());
        student.registerCourse("ming Node JS");
        student.attendClass();

    }
}
