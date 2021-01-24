import java.util.List;
import java.util.stream.Stream;



public class ProductFilter {
    private Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.getColor() == color);
    }
}
