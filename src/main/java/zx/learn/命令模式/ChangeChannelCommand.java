package zx.learn.命令模式;

public class ChangeChannelCommand implements Command {
    private Television tv;

    public ChangeChannelCommand() {
        tv = new Television();
    }

    public void execute() {
        tv.changeChannel();
    }

}