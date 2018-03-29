package chain_of_responsibility.original;

/**
 * @author zhengzechao
 * @date 2018/3/29
 */
public interface Handler {

    int COUNTRY_EVENT = 0;
    int PROVINCE_EVENT = 1;
    int CITY_EVENT = 2;


    void process(Event event);

}
