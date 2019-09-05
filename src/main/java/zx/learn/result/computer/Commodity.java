package zx.learn.result.computer;

public abstract class Commodity {

    public String id = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String introduce();

    public abstract double getPrice();

}
