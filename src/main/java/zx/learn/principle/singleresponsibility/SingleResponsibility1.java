package zx.learn.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/8/26
 * Time: 15:22
 * Description:交通工具类
 * 方式1 run 的返回值，违反了单一职责原则
 * 方式二 根据交通工具运行方法不同，分解成不同的类即可
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("骑了");
        vehicle.run("飞机");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。");
    }
}
