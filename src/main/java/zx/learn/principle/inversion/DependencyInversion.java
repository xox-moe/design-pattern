package zx.learn.principle.inversion;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/8/26
 * Time: 16:58
 * Description:
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        IReceive email = new Email();
        person.receive(email);

    }
}

interface IReceive {
    String getInfo();
}

class Email implements IReceive {
    public String getInfo() {
        return "电子邮箱信息:Hello World!";
    }
}

class Person {
    /**
     * 这里是对接口的依赖
     * @param msg
     */
    public void receive(IReceive msg) {
        System.out.println(msg.getInfo());

    }
}