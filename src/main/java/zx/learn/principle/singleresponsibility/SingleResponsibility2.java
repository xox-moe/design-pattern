package zx.learn.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/8/26
 * Time: 15:27
 * Description:
 * 1.遵守了单一职责原则
 * 2.改动大，即将类分解，同时修改客户端
 * 3.改进，直接使用Vehicle类，改动代码会比较少
 */

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("骑了");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行。。。");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行。。。");
    }
}