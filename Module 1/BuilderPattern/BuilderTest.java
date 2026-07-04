public class BuilderTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA GeForce RTX 3080")
                .setOperatingSystem("Windows 11")
                .build();
        
                gamingPC.display();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam(16)
                .setStorage(512)
                .setGraphicsCard("Integrated Graphics")
                .setOperatingSystem("Windows 10")
                .build();

        officePC.display();
    }
}
