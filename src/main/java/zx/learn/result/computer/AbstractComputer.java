package zx.learn.result.computer;

import lombok.extern.slf4j.Slf4j;

import zx.learn.result.computer.cpu.CPU;
import zx.learn.result.computer.graphcard.GraphicsCard;
import zx.learn.result.computer.memory.Memory;
import zx.learn.result.computer.motherboard.MotherBoard;
import zx.learn.result.配置单.配置单;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:41
 * Description: 电脑，组合模式，假设只由 CPU Memory MotherBoard 组成。  降低代码量
 */
@Slf4j
public class AbstractComputer implements Computer {

    //    Chassis chassis;
    MotherBoard motherBoard;
    //    Power power;
    CPU cpu;
    Memory memory;

    GraphicsCard graphicsCard;

    public AbstractComputer(MotherBoard motherBoard, CPU cpu, Memory memory) {
//        this.chassis = chassis;
        this.motherBoard = motherBoard;
//        this.power = power;
        this.cpu = cpu;
        this.memory = memory;
    }

    public AbstractComputer(MotherBoard motherBoard, CPU cpu, Memory memory, GraphicsCard graphicsCard) {
//        this.chassis = chassis;
        this.motherBoard = motherBoard;
//        this.power = power;
        this.cpu = cpu;
        this.memory = memory;
        this.graphicsCard = graphicsCard;
    }

    public double getPrice() {
//        return chassis.
        return 0;
    }

    public String introduce() {
        double totalPrice = motherBoard.getPrice() + cpu.getPrice() + memory.getPrice();
        String str;
        str = "\n" + motherBoard.introduce() +
                "\n" + cpu.introduce() +
                "\n" + memory.introduce();
        if (graphicsCard != null) {
            str += ("\n" + graphicsCard.introduce());
            totalPrice += graphicsCard.getPrice();
        }
        str += "\n总价：" + totalPrice;

        return str;
    }

    public 配置单 getConfigurationList() {
        配置单 c = new 配置单();
        c.setCpuInfo(cpu.getCpuInfo());
        c.setMemoryInfo(memory.getMemoryInfo());
        c.setMotherBoardInfo(motherBoard.getMotherBoardInfo());
        return c;
    }


}
