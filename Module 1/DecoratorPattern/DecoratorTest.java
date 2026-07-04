public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Welcome");
        System.out.println();

        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Your otp is 1234");
        System.out.println();

        Notifier allNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        allNotifier.send("System maintenance tonight.");
    }
}
