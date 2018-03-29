package chain_of_responsibility.original;


/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class Main {
    public static void main(String[] args) {

        Event event = new Event(Handler.CITY_EVENT, "街区拆迁");


        City city = new City();
        Province province = new Province();
        Country country = new Country();

        switch (event.eventType) {
            case Handler.CITY_EVENT:
                city.process(event);
                break;
            case Handler.PROVINCE_EVENT:
                province.process(event);
                break;

            case Handler.COUNTRY_EVENT:
                province.process(event);
                break;
            default:
                System.out.println("事件飞往火星处理");
                break;


        }

    }

}
