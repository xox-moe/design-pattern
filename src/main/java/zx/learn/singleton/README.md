
采用方法，使得整个程序只有一个该类型的实例

能用的：


```
//懒汉式（线程安全 双重检查）
class Singleton {
 
    private static Singleton singleton;
 
    private Singleton() {
    }
 
    //双重检查  比较好
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
 ```
 
 ---
 
 ```
//内部静态类
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
```

---
```
//枚举
enum Singleton {
 
    INSTANCE;
 
    private Singleton() {
    }
 
    public void sayOk() {
        System.out.println("OK");
    }
 
}
``` 

---
```
//恶汉式（静态代码块）
class Singleton {
 
    private static Singleton singleton;
 
    private Singleton() {
    }
     
    static {
        singleton = new Singleton();
    }
 
    public static Singleton getInstance() {
        return singleton;
    }
}
```