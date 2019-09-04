# 里氏替换原则（Liskov Substitution Principe）


## 继承的缺点

* 继承包含了这样一层含义：父类中已经实现好的方法，实际上是在设定规范和契约，虽然不强制要求子类必须遵循这样的契约，但是如果子类对这些已经实现过的方法进行修改，就会对整个继承体系造成破坏。
* 继承在给程序设计带来便利的同时，也带来了弊端，比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象之间的耦合性。如果一个类需要修改是，必须考虑到所有的子类，并且父类修改后，所有涉及到子类的功能都可能产生故障。


## 在编程中如何使用继承

 * 如果对每个类型为T1的对象O1，都有类型为T2的O2，使得T1定义的所有程序P在的所有对象O1都换成O2时，程序P的行为没有发生改变，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能够透明的使用其子类对象。

 * 使用继承时，遵循里氏替换原则，**在子类中尽量不要重写父类的方法**。

 * 里氏替换原则告诉我们，继承实际上让两个类耦合增强了，在适当情况下，可以通过聚合，组合，依赖来解决问题。
