package BuilderPatternExample;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
            .setCPU("RYZEN 5")
            .setRAM("16GB RAM")
            .setStorage("1TB SSD")
            .build();
        System.out.println(computer);
    }
}