public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 15, 65000);
        Product p2 = new Product(102, "Keyboard", 30, 1200);
        Product p3 = new Product(103, "Mouse", 50, 600);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayProducts();

        System.out.println("\nUpdating Product...\n");
        inventory.updateProduct(102, "Mechanical Keyboard", 40, 2500);

        inventory.displayProducts();

        System.out.println("\nDeleting Product...\n");
        inventory.deleteProduct(103);

        inventory.displayProducts();
    }
}