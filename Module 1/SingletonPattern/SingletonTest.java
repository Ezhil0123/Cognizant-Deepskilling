public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("User Logged In");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application Closed");

        System.out.println();

        System.out.println("logger1 HashCode : " + logger1.hashCode());
        System.out.println("logger2 HashCode : " + logger2.hashCode());
        System.out.println("logger3 HashCode : " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nOnly One Logger Instance Exists.");
        } else {
            System.out.println("\nMultiple Instances Created.");
        }
    }
}