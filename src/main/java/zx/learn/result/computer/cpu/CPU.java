package zx.learn.result.computer.cpu;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import zx.learn.result.computer.Commodity;
import zx.learn.result.配置单.CPUInfo;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:37
 * Description:
 */

@Getter
@Setter
@EqualsAndHashCode
public class CPU extends Commodity {

    public CPU(String brand, String name, int coreNum, int threadNum, double price) {
        this.brand = brand;
        this.name = name;
        this.coreNum = coreNum;
        this.threadNum = threadNum;
        this.price = price;

    }


    public double getPrice() {
        return price;
    }

    protected String brand;
    protected String name;
    protected int coreNum;
    protected int threadNum;

    protected double price;

    public String introduce() {
        return "CPU   品牌：" + brand + "  名称：" + name + "  核心数量：" + coreNum + "  线程数量：" + threadNum + "  价格："+price;
    }

    public CPUInfo getCpuInfo() {
        return new CPUInfo(brand, name, coreNum, threadNum, price);
    }

}
