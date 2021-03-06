package Service;

import Entities.Color;
import Entities.Product;
import Entities.Size;

import java.util.List;
import java.util.stream.Stream;



public class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.getSize() == size);
    }

    public Stream<Product>  filterBySizeAndColor(List<Product> products, Size size, Color color){
        return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);
    }
}
