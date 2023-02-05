import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        
        List<String> productList1 = Arrays.asList("HP Laptop", "Acer Laptop", "Samsung Laptop");
        List<String> productList2 = Arrays.asList("HP Phone", "Acer Phone", "Samsung Phone");
        List<String> productList3 = Arrays.asList("Camera", "Acer Camera", "Samsung Camera");

        List<List<String>> productsList = Arrays.asList(productList1, productList2, productList3);

        productsList.stream()
                    .flatMap(Collection::stream)
                    .forEach(System.out::println);

    }
}
