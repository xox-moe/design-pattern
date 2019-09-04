package zx.learn.模板方法模式;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/4
 * Time: 10:11
 * Description:
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }
}
