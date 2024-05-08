public class PC {
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    // Constructor
    public PC(String motherboard, String processor, String memory, String storage, String graphicsCard) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }
    
    @Override
    public String toString() {
        return "PC{" +
                "motherboard='" + motherboard + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
