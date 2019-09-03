package zx.learn.singleton.s07;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 16:26
 * Description: 枚举
 */
public class Singleton7 {


    public static void main(String[] args) {


        Singleton singleton01 = Singleton.INSTANCE;
        Singleton singleton02 = Singleton.INSTANCE;
//
        assert singleton01 == singleton02;

        singleton01.sayOk();


    }

}


enum Singleton {
    INSTANCE;
    private Singleton() {
    }
    public void sayOk() {
        System.out.println("OK");
    }
}

