package zx.learn.result.computer.cpu;

import lombok.EqualsAndHashCode;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:51
 * Description:
 */
@EqualsAndHashCode
public class IntelCPU extends CPU {
    public IntelCPU(String name, int coreNum, int threadNum, double price) {
        super("Intel", name, coreNum, threadNum, price);
    }
}
