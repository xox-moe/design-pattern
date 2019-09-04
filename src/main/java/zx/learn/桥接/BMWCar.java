package zx.learn.桥接;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BMWCar extends AbstractCar {
    @Override
    public void run() {
        gear.gear();
        log.info("BMW is running");
    }

}