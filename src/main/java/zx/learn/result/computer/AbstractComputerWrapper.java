package zx.learn.result.computer;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 16:45
 * Description:
 */
public class AbstractComputerWrapper implements Computer {

    AbstractComputer abstractComputer;

    public String introduce() {
        return abstractComputer.introduce() + "加灯 性能提升 100%  ！！！！";
    }

    public AbstractComputerWrapper(AbstractComputer abstractComputer) {
        this.abstractComputer = abstractComputer;
    }
}
