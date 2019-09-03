package zx.learn.singleton.s04;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 16:26
 * Description:
 */
public class Singleton4 {

    public static void main(String[] args) {


        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        assert singleton01 == singleton02;


    }

}


//懒汉式（线程安全）
class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    //虽然解决类线程安全，但是效率是问题
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}