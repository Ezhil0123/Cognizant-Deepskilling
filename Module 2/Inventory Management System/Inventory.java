import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {

        if (products.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product Added Successfully.");
        }
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        if (products.containsKey(id)) {

            Product p = products.get(id);

            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);

            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (products.containsKey(id)) {

            products.remove(id);
            System.out.println("Product Deleted Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Display Inventory
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\n------ Inventory ------");

        for (Product p : products.values()) {
            System.out.println(p);
            System.out.println("----------------------");
        }
    }
}