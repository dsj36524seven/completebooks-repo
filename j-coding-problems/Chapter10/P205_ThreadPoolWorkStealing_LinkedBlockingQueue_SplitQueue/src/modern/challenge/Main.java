package modern.challenge;

public class Main {

    // 15 queues with 1,000,000 bulbs each

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
              "[%1$tF %1$tT] [%4$-7s] %5$s %n");
        
        AssemblyLine.startAssemblyLine();      
    }

}
