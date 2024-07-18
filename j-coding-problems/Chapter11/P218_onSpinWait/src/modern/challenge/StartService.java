package modern.challenge;

public class StartService implements Runnable {

    private volatile boolean serviceAvailable;

    @Override
    public void run() {

        System.out.println("Wait for service to be available ...");
        while (!serviceAvailable) {
            // Use a spin-wait hint (ask the processor to optimize the resource)
            // This should perform better if the underlying hardware supports the hint
            try {
                Thread.sleep(1000);
                System.out.println("...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.onSpinWait();
        }

        serviceRun();
    }

    public void serviceRun() {
        System.out.println("Service is now running ...");
    }

    public void setServiceAvailable(boolean serviceAvailable) {
        this.serviceAvailable = serviceAvailable;
    }

}
