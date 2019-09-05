package zx.learn.result.computer.motherboard;

import lombok.Getter;
import lombok.Setter;
import zx.learn.result.computer.Commodity;
import zx.learn.result.配置单.MotherBoardInfo;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:36
 * Description:
 */
@Getter
@Setter
public class MotherBoard extends Commodity {

    protected String brand;
    protected BoardSize size;
    protected double price;

    public MotherBoard(String brand, BoardSize size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String introduce() {
        return "ID:" + id + "品牌：" + brand + " 大小：" + size + " 价格：" + price;
    }

    public MotherBoardInfo getMotherBoardInfo() {
        return new MotherBoardInfo(brand, size, price);
    }

    public static MotherBoard getMotherBoard(MotherBoardInfo info) {
        return new MotherBoard(info.getBrand(), info.getSize(), info.getPrice());
    }

}
