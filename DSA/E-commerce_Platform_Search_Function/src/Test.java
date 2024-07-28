public class Test {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "Desk", "Furniture"),
                new Product(4, "Chair", "Furniture"),
                new Product(5, "Headphones", "Accessories")
        };
        String searchName = "Smartphone";
        Product result = BinarySearch.binarySearch(products, searchName);
        System.out.println("Test 1 - Search for existing product:");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found");
        }
    }
}
