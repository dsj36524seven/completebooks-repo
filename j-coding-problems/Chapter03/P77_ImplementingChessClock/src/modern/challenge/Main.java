package modern.challenge;

import java.time.Duration;
import java.time.Instant;
import modern.challenge.MyChessClock.Player;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyChessClock myChessClock = new MyChessClock(Player.LEFT);

        Instant start = myChessClock.gameStart();
        System.out.println("Game started:" + start);

        Thread.sleep(2000);
        System.out.println("\nLeft moved first after 2 seconds: " + myChessClock.instant());
        Thread.sleep(5000);
        System.out.println("Right moved after 5 seconds: " + myChessClock.instant());
        Thread.sleep(6000);
        System.out.println("\nLeft moved after 6 seconds: " + myChessClock.instant());
        Thread.sleep(1000);
        System.out.println("Right moved after 1 second: " + myChessClock.instant());
        Thread.sleep(2000);
        System.out.println("\nLeft moved after 2 second: " + myChessClock.instant());
        Thread.sleep(3000);
        System.out.println("Right moved after 3 seconds: " + myChessClock.instant());
        Thread.sleep(10000);
        System.out.println("\nLeft moved after 10 seconds: " + myChessClock.instant());
        Thread.sleep(11000);
        System.out.println("Right moved after 11 seconds and win: " + myChessClock.instant());

        Instant end = myChessClock.gameEnd();
        System.out.println("\nGame ended:" + end);

        System.out.println("\n Game duration: " + Duration.between(start, end).getSeconds() + " seconds");
    }

}
