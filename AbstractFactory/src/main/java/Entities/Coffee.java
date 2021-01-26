package Entities;

public class Coffee implements IHotDrink{

    @Override
    public void consume() {
        System.out.println("This cofee is delicious!");
    }
}
