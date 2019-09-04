package zx.learn.桥接;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Auto extends Transmission {
  @Override
  public void gear() {
    log.info("Auto transmission");
  }
}