package App;

import Entities.IHotDrink;
import Service.HotDrinkMachine;

public class Demo {
    public static void main(String[] args) throws Exception{
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink drink = machine.makeDrink();
        drink.consume();

    }
}
