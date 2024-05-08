public class Main {
    public static void main(String[] args) {
        // Create a PCBuilder instance
        GamingPCBuilder gamingpcBuilder = new GamingPCBuilder();
        ApplePCBuilder applepcBuilder = new ApplePCBuilder();
        // Create a PCDirector instance with the PCBuilder
        PCDirector pcDirector = new PCDirector(gamingpcBuilder);
        
        // Construct a gaming PC using the director
        pcDirector.constructGamingPC();
        PC gamingPC = gamingpcBuilder.build();
      
        pcDirector.setBuilder(applepcBuilder);
        pcDirector.constructApplePC();
        PC applePC = applepcBuilder.build();
        // Display PC details
        System.out.println(gamingPC);
        System.out.println(applePC);
    }
}