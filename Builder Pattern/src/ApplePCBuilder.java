public class ApplePCBuilder implements Builder{
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    public ApplePCBuilder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ApplePCBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ApplePCBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public ApplePCBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ApplePCBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public PC build() {
        return new PC(motherboard, processor, memory, storage, graphicsCard);
    }
}