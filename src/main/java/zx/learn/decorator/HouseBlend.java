package zx.learn.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 16:54
 * Description:
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .79;
    }
}
