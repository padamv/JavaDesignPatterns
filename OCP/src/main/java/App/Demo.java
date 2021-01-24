package App;

import Entities.Product;
import Entities.Size;
import java.util.List;
import Entities.Color;
import Service.ProductFilter;

public class Demo {
    public static void main(String[] args) {

        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products (old): ");
        productFilter.filterByColor(products, Color.GREEN)
                .forEach(product -> System.out.println(
                        " - " + product.getName() + " is green"));
    }
}
