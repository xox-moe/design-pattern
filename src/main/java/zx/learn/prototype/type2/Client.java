package zx.learn.prototype.type2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 9:47
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        try {
            // 创建第一个实例
            Prototype p1 = new ConcretePrototype1();
            // 注册第一个实例
            PrototypeManager.setProtoType("p1", p1);

            // 克隆第一个实例的原型
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例的副本：" + p3);

            // 创建第二个实例
            Prototype p2 = new ConcretePrototype2();
            // 注册第二个实例
            PrototypeManager.setProtoType("p2", p2);

            // 克隆第二个实例的原型
            Prototype p4 = PrototypeManager.getPrototype("p2").clone();
            p4.setName("李四");
            System.out.println("第二个实例的副本：" + p4);

            // 注销第一个实例
            PrototypeManager.removePrototype("p1");
            // 再次克隆第一个实例的原型
//            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
//            p5.setName("王五");
//            System.out.println("第一个实例的副本：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


interface Prototype {
    public Prototype clone();

    public String getName();

    public void setName(String name);
}

class ConcretePrototype1 implements Prototype {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1 [name=" + name + "]";
    }

}

class ConcretePrototype2 implements Prototype {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2 [name=" + name + "]";
    }
}

class PrototypeManager {
    /**
     * 用来记录原型的编号同原型实例的对象关系
     */
    private static Map<String, Prototype> map = new HashMap<>();

    /**
     * 私有化构造方法，避免从外部创建实例
     */
    private PrototypeManager() {
    }

    /**
     * 向原型管理器里面添加或者修改原型实例
     *
     * @param prototypeId 原型编号
     * @param prototype   原型实例
     */
    public static void setProtoType(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 根据原型编号从原型管理器里面移除原型实例
     *
     * @param prototypeId 原型编号
     */
    public static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * 根据原型编号获取原型实例
     *
     * @param prototypeId 原型编号
     * @return 原型实例对象
     * @throws Exception 如果根据原型编号无法获取对应实例，则提示异常“您希望获取的原型还没有注册或已被销毁”
     */
    public static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);

        if (prototype == null) {
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }

        return prototype;
    }

}

