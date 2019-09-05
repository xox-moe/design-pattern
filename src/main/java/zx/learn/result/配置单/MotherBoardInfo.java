package zx.learn.result.配置单;

import lombok.Getter;
import lombok.Setter;
import zx.learn.result.computer.motherboard.BoardSize;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 16:26
 * Description:
 */

@Getter
@Setter
public class MotherBoardInfo {

    protected String brand;
    protected BoardSize size;
    protected double price;

    public MotherBoardInfo(String brand, BoardSize size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
}
