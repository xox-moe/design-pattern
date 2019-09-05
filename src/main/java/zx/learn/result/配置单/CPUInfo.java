package zx.learn.result.配置单;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 16:25
 * Description:
 */
public class CPUInfo {

    protected String brand;
    protected String name;
    protected int coreNum;
    protected int threadNum;

    protected double price;

    public CPUInfo(String brand, String name, int coreNum, int threadNum, double price) {
        this.brand = brand;
        this.name = name;
        this.coreNum = coreNum;
        this.threadNum = threadNum;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public int getThreadNum() {
        return threadNum;
    }

    public double getPrice() {
        return price;
    }
}
