package zx.learn.result.computer;

import zx.learn.result.配置单.配置单;

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
        return abstractComputer.introduce() + " 加灯 性能提升 100%  ！！！！";
    }

    @Override
    public 配置单 getConfigurationList() {
        return abstractComputer.getConfigurationList();
    }

    public AbstractComputerWrapper(AbstractComputer abstractComputer) {
        this.abstractComputer = abstractComputer;
    }
}
