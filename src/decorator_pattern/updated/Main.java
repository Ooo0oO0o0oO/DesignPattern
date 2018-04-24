package decorator_pattern.updated;

/**
 * @author zhengzechao
 * @date 2018/4/24
 * Email ooczzoo@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Clerk clerk = new OrdinaryClerk("HC001");

        clerk = new FIrstClerkDecorator(clerk);
        clerk = new SecondClerkDecorator(clerk);
        clerk.reportWork();

        Clerk clerk2 = new OrdinaryClerk("HC002");
        clerk2 = new SecondClerkDecorator(clerk2);
        clerk2.reportWork();
    }
}
