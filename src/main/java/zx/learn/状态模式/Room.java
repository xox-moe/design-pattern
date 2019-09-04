package zx.learn.状态模式;

import lombok.Getter;
import lombok.Setter;


/**
 * 该类持有三个状态，执行动作时实际上是执行状态中的动作
 * 动作可能改变持有的状态，
 */

@Getter
@Setter
public class Room {
    /*
     * 房间的三个状态
     */
    State freeTimeState;    //空闲状态
    State checkInState;     //入住状态
    State bookedState;      //预订状态

    State state;

    public Room() {
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);

        state = freeTimeState;  //初始状态为空闲
    }

    /**
     * @return void
     * @desc 预订房间
     */
    public void bookRoom() {
        state.bookRoom();
    }

    /**
     * @return void
     * @desc 退订房间
     */
    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    /**
     * @return void
     * @desc 入住
     */
    public void checkInRoom() {
        state.checkInRoom();
    }

    /**
     * @return void
     * @desc 退房
     */
    public void checkOutRoom() {
        state.checkOutRoom();
    }

    public String toString() {
        return "该房间的状态是:" + getState().getClass().getName();
    }

}