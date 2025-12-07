public class Subscriber {
    private String subscriberName;

    public Subscriber() {}

    public Subscriber(String name) {
        this.subscriberName = name;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String name) {
        this.subscriberName = name;
    }

    // CLEAN UPDATED METHOD
    public void update(String news) {
        System.out.println(subscriberName + " received update: " + news);
    }
}
