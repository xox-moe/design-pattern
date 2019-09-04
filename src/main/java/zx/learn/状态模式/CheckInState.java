package zx.learn.状态模式;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/4
 * Time: 14:55
 * Description:
 */
public class CheckInState implements State {

    Room hotelManagement;

    public CheckInState(Room room) {
        this.hotelManagement = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkInRoom() {
        System.out.println("退房成功....");
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }

    @Override
    public void checkOutRoom() {
    }
}
