package zx.learn.状态模式;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/4
 * Time: 14:54
 * Description:
 */
public interface State {
    /**
     * @return void
     * @desc 预订房间
     */
    public void bookRoom();

    /**
     * @return void
     * @desc 退订房间
     */
    public void unsubscribeRoom();

    /**
     * @return void
     * @desc 入住
     */
    public void checkInRoom();

    /**
     * @return void
     * @desc 退房
     */
    public void checkOutRoom();


}
