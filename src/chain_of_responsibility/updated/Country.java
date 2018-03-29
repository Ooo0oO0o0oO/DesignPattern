package chain_of_responsibility.updated;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class Country extends Handler {

    public Country(int processType) {
        this.processType = this.processType;

    }

    @Override
    public void process(Event event) {

        System.out.println(event);
        System.out.println("我来处理这个国家大事");
    }
}
