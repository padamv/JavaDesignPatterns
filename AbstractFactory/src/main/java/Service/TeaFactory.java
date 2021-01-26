package Service;

import Entities.IHotDrink;
import Entities.Tea;

public class TeaFactory implements IHotDrinkFactory{
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("Put tea bag, boil water, pour "
        + amount + "ml, add lemon, enjoy");
        return new Tea();
    }
}
