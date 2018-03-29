package chain_of_responsibility.updated;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public abstract class Handler {

    public static final int COUNTRY_EVENT = 0;
    public static final int PROVINCE_EVENT = 1;
    public static final int CITY_EVENT = 2;

    public int processType = -1; //能处理的事件的类型

    public Handler next = null; //下一个处理类


    /**
     * 事件分发给合适的处理单位
     * @param event
     */
    public void handleEvent(Event event) {

        if (event.eventType == this.processType) {
            process(event);

        } else {
            if (next == null) {
                System.out.println("没有能处理的,自行解决吧");
            } else {

                next.handleEvent(event);
            }
        }


    }


    /**
     *
     *
     * @param handler 注入的next
     * @return 注入的next
     */
    public Handler setNext(Handler handler){
        this.next = handler;
        return this.next;
    }
    abstract void process(Event event);

}
