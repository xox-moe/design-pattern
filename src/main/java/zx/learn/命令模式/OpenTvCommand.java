package zx.learn.命令模式;

public class OpenTvCommand implements Command {
    private Television tv;

    public OpenTvCommand() {
        tv = new Television();
    }

    public void execute() {
        tv.open();
    }

}