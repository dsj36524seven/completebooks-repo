package modern.challenge;

public class Incrementor implements Runnable {

    public static int count = 0;
    
    @Override
    public void run() {
        count ++;
    }

    public int getCount() {
        return count;
    }        
}
