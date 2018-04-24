package decorator_pattern.updated;

/**
 * @author zhengzechao
 * @date 2018/4/24
 * Email ooczzoo@gmail.com
 */
public abstract class Decorator extends Clerk{

    protected Clerk clerk;

    public Decorator(Clerk clerk) {
        this.clerk = clerk;
    }


    @Override
    public void reportWork() {
        this.clerk.reportWork();
    }


    @Override
    public String getId() {
        return this.clerk.getId();
    }
}
