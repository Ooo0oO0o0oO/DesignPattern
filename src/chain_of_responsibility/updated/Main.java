package chain_of_responsibility.updated;


/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public class Main {
    public static void main(String[] args) {
        Handler city = new City(Handler.CITY_EVENT);
        city.setNext(new Province(Handler.PROVINCE_EVENT)).setNext(new Country(Handler.COUNTRY_EVENT));

        Event event = new Event(Handler.PROVINCE_EVENT,"城市改名");
        city.handleEvent(event);

        Event event1 = new Event(10,"火星移民");

        city.handleEvent(event1);



    }

}
