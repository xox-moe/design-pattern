package zx.learn.result.computer.graphcard;

import lombok.EqualsAndHashCode;
import zx.learn.result.computer.Commodity;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:37
 * Description:
 */
@EqualsAndHashCode
public class GraphicsCard extends Commodity {

    String brand;
    String name;
    double price;

    @Override
    public String introduce() {
        return "品牌：" + brand + "  名称:" + name + "  价格:" + price;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
