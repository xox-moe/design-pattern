package zx.learn.singleton.s05;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 16:26
 * Description:
 */
public class Singleton5 {

    public static void main(String[] args) {


        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        assert singleton01 == singleton02;


    }

}


//懒汉式（线程安全 双重检查）
class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    //双重检查  比较好
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}