package modern.challenge;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Objects;

public class MyChessClock extends Clock implements Serializable {

    public enum Player {
        LEFT,
        RIGHT
    }

    private static final long serialVersionUID = 1L;

    private Instant instantStart;
    private Instant instantLeft;
    private Instant instantRight;
    private long timeLeft;
    private long timeRight;
    private Player player;


    //constructor
    public MyChessClock(Player player) {
        this.player = player;
    }

    public Instant gameStart() {
        if (this.instantStart == null) {
            this.timeRight = 0;
            this.timeLeft = 0;
            this.instantStart = Instant.now();
            this.instantLeft = instantStart;
            this.instantRight = instantStart;
            return instantStart;
        }

        throw new IllegalStateException("Game already started, stop it and try again.");
    }

    public Instant gameEnd() {
        if (this.instantStart != null) {
            instantStart = null;
            return Instant.now();
        }

        throw new IllegalStateException("Game was not started.");
    }



    @Override
    public ZoneId getZone() {
        return ZoneOffset.UTC;
    }

    @Override
    public Clock withZone(ZoneId zoneId) {
       throw new UnsupportedOperationException(
               "The MyChessClock works only in UTC time zone");
    }

    @Override
    public Instant instant() {

        if (this.instantStart != null) {
            if(player == Player.LEFT) {
                player = Player.RIGHT;
                long secondsLeft = Instant.now().getEpochSecond() -
                        instantRight.getEpochSecond();
                instantLeft = instantLeft.plusSeconds(secondsLeft -
                        timeLeft);
                timeLeft = secondsLeft;
                return instantLeft;
            } else {
                player = Player.LEFT;
                long secondsRight = Instant.now().getEpochSecond() -
                        instantLeft.getEpochSecond();
                instantRight = instantRight.plusSeconds(secondsRight -
                        timeRight);
                timeRight = secondsRight;
                return instantRight;

            }
        }

        throw new IllegalStateException(" Game was not started.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MyChessClock that = (MyChessClock) o;
        return timeLeft == that.timeLeft &&
                timeRight == that.timeRight &&
                Objects.equals(instantStart, that.instantStart) &&
                Objects.equals(instantLeft, that.instantLeft) &&
                Objects.equals(instantRight, that.instantRight) &&
                player == that.player;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), instantStart, instantLeft, instantRight, timeLeft, timeRight, player);
    }

    @Override
    public String toString() {
        return "MyChessClock{ " +
                " instantStart= " + instantStart +
                ", instantLeft= " + instantLeft +
                ", instantRight= " + instantRight +
                ", timeLeft= " + timeLeft +
                ", timeRight= " + timeRight +
                ", player= " + player +
                " }";
    }
}
