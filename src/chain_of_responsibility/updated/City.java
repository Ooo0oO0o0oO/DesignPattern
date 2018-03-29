package chain_of_responsibility.updated;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class City extends Handler {

    public City(int processType) {
        this.processType = this.processType;

    }

    @Override
    public void process(Event event) {
        System.out.println(event);
        System.out.println("我来处理这个市级事件");
    }
}
