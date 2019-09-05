package zx.learn.result.computer;

import zx.learn.result.computer.cpu.CPU;
import zx.learn.result.computer.cpu.CPUFactory;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 14:13
 * Description:
 */
public class ComputerFactory {

    public static AbstractComputer getComputer(ConfigurationList configuration) throws Exception {
        CPU cpu = CPUFactory.getCpu(configuration.cpuBrand, configuration.cpuName, configuration.cpuCoreNum, configuration.cpuThreadNum,configuration.cpuPrice);
//        Chassis chassis = ChassisFactory.getChassis(configuration.chassisBrand, configuration.chassisSize, configuration.chassisPrice);


        return new AbstractComputer(  null, cpu,null);

    }

}
