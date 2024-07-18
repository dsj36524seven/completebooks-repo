package modern.challenge;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> dateTimes8 = DateTimes.localTimeToAllTimeZones8();
        dateTimes8.forEach(System.out::println);
    }
    
}
