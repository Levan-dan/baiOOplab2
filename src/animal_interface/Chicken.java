package animal_interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "cuc ta cuc tac";
    }

    @Override
    public String howToEat() {
        return "an gao";
    }
}
