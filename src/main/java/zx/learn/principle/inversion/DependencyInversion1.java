package zx.learn.principle.inversion;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/8/26
 * Time: 16:58
 * Description:
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Email1 email = new Email1();
        person1.receive(email);

    }
}

class Email1 {
    public String getInfo() {
        return "电子邮箱信息:Hello World!";
    }
}

class Person1 {
    /**
     * 这里直接依赖了Email 不应该，如果要接受 短信，微信 的信息，就需要很大的改动。
     * @param email
     */
    public void receive(Email1 email) {
        System.out.println(email.getInfo());

    }
}