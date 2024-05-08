public interface Builder {
    Builder setMotherboard(String motherboard);
    Builder setProcessor(String processor);
    Builder setMemory(String memory);
    Builder setStorage(String storage);
    Builder setGraphicsCard(String graphicsCard);
    PC build();
}