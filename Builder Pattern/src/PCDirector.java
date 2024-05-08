public class PCDirector {
    private Builder builder;

    public PCDirector(Builder Builder) {
        this.builder = Builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public void constructGamingPC() {
        builder.setMotherboard("ASUS ROG Strix B550-F Gaming")
                .setProcessor("AMD Ryzen 9 5900X")
                .setMemory("32GB DDR4 RAM")
                .setStorage("1TB NVMe SSD")
                .setGraphicsCard("NVIDIA GeForce RTX 3080");
    }

    public void constructApplePC() {
        builder.setMotherboard("Apple M1 Chipset")
                .setProcessor("Apple Silicon")
                .setMemory("16GB Unified RAM")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Apple GPU");
    }
}