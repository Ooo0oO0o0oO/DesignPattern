package proxy_pattern;

import java.util.HashMap;

/**
 * @author zhengzechao
 * @date 2018/4/7
 */
public class ImprovedMain {
    public static void main(String[] args) {
        HashMap<String,Integer> counts = new HashMap<>();
        Seller seller1 = new HouseSeller("销售员A");
        Seller proxy1 = new HouseSellerProxy(seller1,counts);
        proxy1.sell();
        proxy1.sell();

        Seller seller2 = new HouseSeller("销售员B");
        Seller proxy2 = new HouseSellerProxy(seller2,counts);

        proxy2.sell();
        proxy2.sell();
        proxy2.sell();

        System.out.println(counts);



    }
}
