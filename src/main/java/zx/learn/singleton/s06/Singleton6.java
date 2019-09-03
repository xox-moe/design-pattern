package zx.learn.singleton.s06;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 16:26
 * Description: 静态内部类
 */
public class Singleton6 {



    public static void main(String[] args) {


        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
//
        assert singleton01 == singleton02;


    }

}


class Singleton {

    private Singleton() { }

    //内部类是懒加载，线程安全
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}

