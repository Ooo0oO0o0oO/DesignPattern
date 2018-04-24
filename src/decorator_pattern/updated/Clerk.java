package decorator_pattern.updated;

/**
 * @author zhengzechao
 * @date 2018/4/24
 * Email ooczzoo@gmail.com
 */
public abstract class Clerk {
    public Clerk() {
    }

    public Clerk(String id) {
        this.id = id;
    }

    private String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void reportWork();
}
