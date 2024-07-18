package modern.challenge;

public class Main {

    public static void main(String[] args) {

        Delivery.deliver(d -> d.firstname("Mark")
                .lastname("Kyilt")
                .address("25th Street, New York")
                .content("10 books"));
    }

}
