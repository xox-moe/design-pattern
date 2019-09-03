package zx.learn.singleton.s03;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 16:26
 * Description:
 */
public class Singleton3 {

    public static void main(String[] args) {


        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        assert singleton01 == singleton02;


    }

}


//懒汉式（线程不安全）
class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }


    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}