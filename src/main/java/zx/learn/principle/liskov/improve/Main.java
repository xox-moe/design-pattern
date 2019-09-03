package zx.learn.principle.liskov.improve;

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
        System.out.println("11-3=" + a.fun1(11, 3));

        B b = new B(a);

        System.out.println("11+3=" + b.fun1(11, 3));
        System.out.println("11-3=" + b.afun1(11, 3));
        System.out.println("11 *** 3=" + b.fun1(11, 3));
    }
}

class Base {

}


class A extends Base {
    public int fun1(int a, int b) {
        return a - b;
    }
}

class B extends Base {

    public A a;

    public B(A a) {
        this.a = a;
    }

    int fun1(int num1, int num2) {
        return num1 + num2;
    }

    int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }

    int afun1(int num1, int num2) {
        return a.fun1(num1, num2);
    }
}