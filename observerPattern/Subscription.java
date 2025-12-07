import java.util.*;

public class Subscription {
    public static void main(String[] args) {

        Subscriber mike = new Subscriber("Angelyn");
        Subscriber lisa = new Subscriber("Aletheos");
        Subscriber john = new Subscriber("Booker");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(mike);
        subscriberList.add(lisa);
        subscriberList.add(john);

        NewsAgency agency = new NewsAgency();
        agency.setAgencyName("Reuters");
        agency.setBreakingNews("New discovery in space");
        agency.setSubscriberList(subscriberList);

        System.out.println("Breaking News!");
        agency.notifySubscribers();

        // Detach John (Booker)
        agency.detach(john);

        // Add new Booker subscriber
        Subscriber booker = new Subscriber("Booker");
        agency.attach(booker);

        agency.setBreakingNews("It was a satellite malfunction");

        System.out.println("\nUpdates recently!");
        agency.notifySubscribers();
    }
}
