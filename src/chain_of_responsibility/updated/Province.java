package chain_of_responsibility.updated;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class Province extends Handler {


    public Province(int processType) {
        this.processType = processType;
    }

    @Override
    public void process(Event event){
        System.out.println(event);
        System.out.println("我来处理这个省份事件");
    }
}
