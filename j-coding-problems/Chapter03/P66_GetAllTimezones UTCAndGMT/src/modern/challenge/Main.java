package modern.challenge;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    
        List<String> timezones7 = DateTimes.fetchTimeZones7(DateTimes.OffsetType.UTC);                
        List<String> timezones8 = DateTimes.fetchTimeZones8(DateTimes.OffsetType.UTC);

        System.out.println("Timezone7");
        System.out.println(timezones7.stream().count());

        //timezones7.forEach(System.out::println);
        System.out.println("Timezone8");
        Collections.sort(timezones8);
        timezones8.forEach(System.out::println);
        //System.out.println(timezones8.stream().count());
    }
    
}
