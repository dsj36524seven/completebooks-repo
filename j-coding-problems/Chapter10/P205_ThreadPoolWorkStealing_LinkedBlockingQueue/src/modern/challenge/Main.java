package modern.challenge;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // a queue with 15,000,000 bulbs

        System.setProperty("java.util.logging.SimpleFormatter.format",
              "[%1$tT] [%4$-7s] %5$s %n");
        
        AssemblyLine.startAssemblyLine();      
    }

}
