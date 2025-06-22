public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Book", "Education"),
            new Product(105, "Watch", "Accessories")
        };

        Product result1 = SearchEngine.linearSearch(products, "Book");
        System.out.println("Linear Search Result: " + result1);

        Product result2 = SearchEngine.binarySearch(products, "Book");
        System.out.println("Binary Search Result: " + result2);
    }
}
