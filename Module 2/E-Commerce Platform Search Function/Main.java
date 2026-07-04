public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Accessories"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Speaker", "Audio")

        };

        // Linear Search

        System.out.println("LINEAR SEARCH");

        Product result1 = SearchOperations.linearSearch(products, "Mouse");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        // Sort before Binary Search

        SearchOperations.sortProducts(products);

        System.out.println("\nBINARY SEARCH");

        Product result2 = SearchOperations.binarySearch(products, "Mouse");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}