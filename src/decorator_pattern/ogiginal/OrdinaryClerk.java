package decorator_pattern.ogiginal;

/**
 * @author zhengzechao
 * @date 2018/4/24
 * Email ooczzoo@gmail.com
 */
public class OrdinaryClerk extends Clerk {
    public OrdinaryClerk(String id) {
        super(id);
    }

    @Override
    public void reportWork() {
        System.out.println("工号:"+this.getId()+",正在汇报工作");
    }
}
