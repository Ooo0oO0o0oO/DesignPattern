package proxy_pattern;

import java.util.HashMap;

/**
 * @author zhengzechao
 * @date 2018/4/7
 */
public class HouseSellerProxy implements Seller {

    public Seller seller;
    private HashMap<String, Integer> counts;

    @Override
    public String getName() {
        return seller.getName();
    }

    @Override
    public void sell() {

        seller.sell();
        //登记
        if (counts.containsKey(seller.getName())) {
            Integer oldVal = counts.get(seller.getName());
            counts.put(seller.getName(), oldVal + 1);

        } else {
            counts.put(seller.getName(), 1);
        }

    }

    public HouseSellerProxy(Seller seller, HashMap<String, Integer> counts) {
        this.seller = seller;
        this.counts = counts;
    }
}
