package zx.learn.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 16:54
 * Description:
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return .89;
    }
}
