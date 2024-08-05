package DongVat_meo;

public class Cat extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "meo meo";
    }

    @Override
    public String howToEat() {
        return "nhoawm nhoawm";
    }
}
