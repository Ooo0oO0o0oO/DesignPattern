package chain_of_responsibility.original;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class Event {

    public int eventType = -1;

    public String eventDetail;
    public Event(int eventType,String eventDetail) {

        this.eventType = eventType;
        this.eventDetail = eventDetail;
    }


    @Override
    public String toString() {
        return "Event{" +
                "eventType=" + eventType +
                ", eventDetail='" + eventDetail + '\'' +
                '}';
    }
}
