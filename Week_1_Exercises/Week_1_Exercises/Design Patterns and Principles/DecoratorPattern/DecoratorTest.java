package DecoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("Abishek Kannuswamy"); 
    }
}