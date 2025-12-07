import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String agencyName;
    private String breakingNews;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public void setAgencyName(String name) {
        this.agencyName = name;
    }

    public void setBreakingNews(String news) {
        this.breakingNews = news;
    }

    public void setSubscriberList(List<Subscriber> list) {
        this.subscriberList = list;
    }

    public void attach(Subscriber s) {
        subscriberList.add(s);
    }

    public void detach(Subscriber s) {
        subscriberList.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber s : subscriberList) {
            s.update(breakingNews);
        }
    }
}
