package ProxyPatternExample;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("abi.jpg");
        image.display(); 
        image.display(); 
    }
}