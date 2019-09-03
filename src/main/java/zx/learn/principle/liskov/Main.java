package zx.learn.principle.liskov;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 14:09
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.fun1(11,3));

        B b = new B();

        System.out.println("11-3=" + b.fun1(11,3));
        System.out.println("11 *** 3=" + b.fun1(11,3));
    }
}


class A{
    int fun1(int a ,int b) {
        return a - b;
    }
}

class B extends A {
    int fun1(int a ,int b) {
        return a + b;
    }

    int fun2(int a ,int b) {
        return fun1(a, b) + 9;
    }
}