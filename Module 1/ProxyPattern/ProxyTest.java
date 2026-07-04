public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("nature.jpg");
        System.out.println("Image object created.");

        System.out.println("First Display: ");
        image.display();

        System.out.println("Second Display: ");
        image.display();
    }
}
