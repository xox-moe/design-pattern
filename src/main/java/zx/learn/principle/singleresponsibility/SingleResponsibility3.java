package zx.learn.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/8/26
 * Time: 15:31
 * Description:方式三，
 * 1. 没有对没有对原来的类做大的修改，只是增加方法
 * 2. 这里没有在类的级别上遵守单一职责原则，但是在方法级别上，仍然遵守单一职责原则
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("摩托车");
        vehicle2.runRoad("骑了");
        vehicle2.runAir("飞机");
    }

}

class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行。。。");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行。。。");
    }
}