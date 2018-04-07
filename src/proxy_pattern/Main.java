package proxy_pattern;

import java.util.HashMap;

/**
 * @author zhengzechao
 * @date 2018/4/7
 */
public class Main {


//    public static void main(String[] args) {
//        HouseSeller seller = new HouseSeller("房产销售人员A");
//
//        seller.sell();
//    }




    public static void main(String[] args) {
        HashMap<String,Integer> counts = new HashMap<>();
        HouseSeller seller = new HouseSeller("人员A");

        seller.sell();
        registry(counts,seller);

        seller.sell();
        registry(counts,seller);

        HouseSeller seller2 = new HouseSeller("人员B");
        registry(counts,seller2);
        System.out.println(counts);


    }


    public static void registry(HashMap<String,Integer> counts,HouseSeller seller){
        if(counts.containsKey(seller.getName())){
            Integer oldVal = counts.get(seller.getName());
            counts.put(seller.getName(),oldVal+1);

        }else{
            counts.put(seller.getName(),1);
        }
    }
}
