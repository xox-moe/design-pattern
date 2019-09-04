package zx.learn.迭代器模式;

public interface TelevisionMenu {
    public void addItem(int channe,String name,String description);
    public Iterator createIrerator();
}