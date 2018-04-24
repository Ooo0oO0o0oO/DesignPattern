package decorator_pattern.updated;

/**
 * @author zhengzechao
 * @date 2018/4/24
 * Email ooczzoo@gmail.com
 */
public class SecondClerkDecorator extends Decorator{
    public SecondClerkDecorator(Clerk clerk) {
        super(clerk);
    }

    @Override
    public void reportWork() {
        System.out.println(getId()+" 买星巴克");
        super.reportWork();
    }
}
