package zx.learn.decorator;

/**
 * 具体的装饰者
 * @author 98583
 *
 */
public class Mocha extends CondimentDecorator {
    /**
     * 保留一个被装饰者的引用
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}