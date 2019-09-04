package zx.learn.状态模式;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/4
 * Time: 14:55
 * Description:
 */
public class BookedState implements State {

    Room hotelManagement;

    public BookedState(Room room) {
        this.hotelManagement = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功...");
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退订成功,欢迎下次光临...");
        hotelManagement.setState(hotelManagement.getFreeTimeState());   //变成空闲状态
    }
}
