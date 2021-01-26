package Service;

import Entities.IHotDrink;

public interface IHotDrinkFactory {
    IHotDrink prepare(int amount);
}
