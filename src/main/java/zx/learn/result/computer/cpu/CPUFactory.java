package zx.learn.result.computer.cpu;

import zx.learn.result.配置单.CPUInfo;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:55
 * Description:
 */
public class CPUFactory {
    public static CPU getCpu(String brand, String name, int coreNum, int threadNum,double price) throws Exception {
        switch (brand) {
            case "Intel":
                return new IntelCPU(name, coreNum, threadNum,price);
            case "AMD":
                return new AMDCPU(name, coreNum, threadNum,price);
            default:
                throw new Exception("没有改品牌的CPU");
        }
    }

    public static CPU getCpu(CPUInfo cpuInfo) throws Exception {
        return getCpu(cpuInfo.getBrand(), cpuInfo.getName(), cpuInfo.getCoreNum(), cpuInfo.getThreadNum(), cpuInfo.getPrice());
    }
}
