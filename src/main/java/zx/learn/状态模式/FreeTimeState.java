package zx.learn.状态模式;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/4
 * Time: 14:54
 * Description:
 */
public class FreeTimeState implements State {

    Room hotelManagement;

    public FreeTimeState(Room room) {
        this.hotelManagement = room;

    }

    @Override
    public void bookRoom() {
        System.out.println("您已经成功预订了...");
        //改变状态
        hotelManagement.setState(hotelManagement.bookedState);
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("您已经成功入住了...");

        hotelManagement.setState(hotelManagement.checkInState);
    }

    @Override
    public void checkInRoom() {

    }

    @Override
    public void checkOutRoom() {

    }
}
