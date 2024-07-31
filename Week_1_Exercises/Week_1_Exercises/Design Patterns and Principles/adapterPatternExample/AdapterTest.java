package adapterPatternExample;

public class AdapterTest {
    public static void main(String[] args) {
        PayPal pal = new PayPal();
        PaymentProcessor processor = new PayPalAdapter(Pal);
        processor.processPayment(340.0); 
    }
}