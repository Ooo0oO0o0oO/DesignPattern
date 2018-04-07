package proxy_pattern;

/**
 * @author zhengzechao
 * @date 2018/4/7
 */
public class HouseSeller implements Seller{

    String name;
    public HouseSeller(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sell(){
        System.out.println("销售人员"+name+"卖出一套房子");

    }
}
