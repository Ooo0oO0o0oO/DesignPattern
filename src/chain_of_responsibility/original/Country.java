package chain_of_responsibility.original;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class Country implements Handler {


    @Override
    public void process(Event event) {

        System.out.println(event);
        System.out.println("我来处理这个国家大事");
    }
}
