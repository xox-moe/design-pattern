package zx.learn.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 16:54
 * Description:
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";

    }
}
