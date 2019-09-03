package zx.learn.prototype;

/**
 * 抽象原型角色
 */

public class SimplePrototype{

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1("dd");
        Prototype p2 = prototype.clone();

        System.out.println(prototype.hashCode());
        System.out.println(p2.hashCode());


    }

}


abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象。
     */
    public abstract Prototype clone();
}


class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1(this.getId());
        return prototype;
    }
}



class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String id) {
        super(id);
    }

    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2(this.getId());
        return prototype;
    }
}


