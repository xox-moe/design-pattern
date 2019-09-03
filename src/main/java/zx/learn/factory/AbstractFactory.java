package zx.learn.factory;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 8:50
 * Description:
 * 　这个模式最不好理解，而且在实际应用中局限性也蛮大的，因为这个模式并不符合开闭原则。实际开发还需要做好权衡。
 *   抽象工厂模式是工厂方法的仅一步深化，在这个模式中的工厂类不单单可以创建一个对象，而是可以创建一组对象。这是和工厂方法最大的不同点。
 *
 * 定义：
 * 　　提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
 *    （在抽象工厂模式中，每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的对象）
 *
 * 抽象工厂和工厂方法一样可以划分为4大部分：
 * AbstractFactory（抽象工厂）: 声明了一组用于创建对象的方法，注意是一组。
 * ConcreteFactory（具体工厂）：它实现了在抽象工厂中声明的创建对象的方法，生成一组具体对象。
 * AbstractProduct（抽象产品）：它为每种对象声明接口，在其中声明了对象所具有的业务方法。
 * ConcreteProduct（具体产品）：它定义具体工厂生产的具体对象。
 * 下面还是先看一个具体实例。
 *
 * 实例：
 * 　　现在需要做一款跨平台的游戏，需要兼容Android，Ios，Wp三个移动操作系统，
 * 该游戏针对每个系统都设计了一套操作控制器（OperationController）和界面控制器（UIController），
 * 下面通过抽象工厂方式完成这款游戏的架构设计。
 *
 *
 * 适用场景：
 * （1）和工厂方法一样客户端不需要知道它所创建的对象的类。
 * （2）需要一组对象共同完成某种功能时。并且可能存在多组对象完成不同功能的情况。
 * （3）系统结构稳定，不会频繁的增加对象。（因为一旦增加就需要修改原有代码，不符合开闭原则）
 */
public class AbstractFactory {

    public static void main(String[] args) {
        SystemFactory mFactory;
        UIController interfaceController;
        OperationController operationController;

        //Android
        mFactory=new AndroidFactory();
        //IOS
        mFactory=new IosFactory();
        //WP
        mFactory=new WpFactory();

        interfaceController=mFactory.createInterfaceController();
        operationController=mFactory.createOperationController();
        interfaceController.display();
        operationController.control();
    }
}


interface OperationController {
    void control();
}
interface UIController {
    void display();
}

class AndroidOperationController implements OperationController {

    public void control() {
        System.out.println("AndroidOperationController");
    }
}

class AndroidUIController implements UIController {

    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}

class IosOperationController implements OperationController {
    public void control() {
        System.out.println("IosOperationController");
    }
}

 class IosUIController implements UIController {
    public void display() {
        System.out.println("IosInterfaceController");
    }
}
class WpOperationController implements OperationController {
    public void control() {
        System.out.println("WpOperationController");
    }
}
class WpUIController implements UIController {
    public void display() {
        System.out.println("WpInterfaceController");
    }
}

interface SystemFactory {
    public OperationController createOperationController();
    public UIController createInterfaceController();
}

class AndroidFactory implements SystemFactory {

    public OperationController createOperationController() {
        return new AndroidOperationController();
    }


    public UIController createInterfaceController() {
        return new AndroidUIController();
    }
}

class IosFactory implements SystemFactory {
    public OperationController createOperationController() {
        return new IosOperationController();
    }

    public UIController createInterfaceController() {
        return new IosUIController();
    }
}

class WpFactory implements SystemFactory {

    public OperationController createOperationController() {
        return new WpOperationController();
    }


    public UIController createInterfaceController() {
        return new WpUIController();
    }
}
