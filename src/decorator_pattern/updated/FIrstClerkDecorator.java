package decorator_pattern.updated;

/**
 * @author zhengzechao
 * @date 2018/4/24
 * Email ooczzoo@gmail.com
 */
public class FIrstClerkDecorator extends Decorator{

    public FIrstClerkDecorator(Clerk clerk) {
        super(clerk);
    }

    @Override
    public void reportWork() {
        System.out.println(getId()+" 写概要书");
        super.reportWork();

    }
}
