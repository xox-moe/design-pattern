package zx.learn.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 16:54
 * Description:
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.88 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
