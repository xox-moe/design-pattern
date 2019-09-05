package zx.learn.result.computer.cpu;

import lombok.EqualsAndHashCode;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:52
 * Description:
 */
@EqualsAndHashCode
public class AMDCPU extends CPU {


    public AMDCPU(String name, int coreNum, int threadNum, double price) {
        super("AMD", name, coreNum, threadNum, price);
    }

}
