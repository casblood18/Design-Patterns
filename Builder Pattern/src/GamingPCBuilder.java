public class GamingPCBuilder implements Builder{
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    public GamingPCBuilder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public GamingPCBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public GamingPCBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public GamingPCBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public GamingPCBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public PC build() {
        return new PC(motherboard, processor, memory, storage, graphicsCard);
    }
}