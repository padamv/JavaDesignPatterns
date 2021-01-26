package Entities;

public class Tea implements IHotDrink{

    @Override
    public void consume() {
        System.out.println("This tea is nice.");
    }
}
