package peoble;

public class PeopleIMPL extends People implements Student{
    public PeopleIMPL(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public String eat() {
        return "an com";
    }

    @Override
    public String sleep() {
        return "ngu nuong";
    }

    @Override
    public String study() {
        return "hoc thuc hanh";
    }

    @Override
    public void registerCourse(String cous) {
        System.out.println("java");
    }

    @Override
    public void attendClass() {
        System.out.println("lop lay vo");
    }
}
