package zx.learn.result.配置单;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 16:25
 * Description:
 */
public class MemoryInfo {
    String brand;
    int size;
    int frequency;
    double price;

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getFrequency() {
        return frequency;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MemoryInfo(String brand, int size, int frequency, double price) {
        this.brand = brand;
        this.size = size;
        this.frequency = frequency;
        this.price = price;
    }
}
