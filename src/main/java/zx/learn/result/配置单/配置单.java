package zx.learn.result.配置单;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 16:26
 * Description:
 */
public class 配置单 {
    CPUInfo cpuInfo;
    MemoryInfo memoryInfo;
    MotherBoardInfo motherBoardInfo;

    public CPUInfo getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(CPUInfo cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public MemoryInfo getMemoryInfo() {
        return memoryInfo;
    }

    public void setMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    public MotherBoardInfo getMotherBoardInfo() {
        return motherBoardInfo;
    }

    public void setMotherBoardInfo(MotherBoardInfo motherBoardInfo) {
        this.motherBoardInfo = motherBoardInfo;
    }
}
