package zx.learn.result;

import lombok.extern.slf4j.Slf4j;
import zx.learn.result.computer.Commodity;
import zx.learn.result.computer.AbstractComputer;
import zx.learn.result.computer.AbstractComputerWrapper;
import zx.learn.result.computer.Computer;
import zx.learn.result.computer.cpu.CPU;
import zx.learn.result.computer.cpu.CPUFactory;
import zx.learn.result.computer.memory.Memory;
import zx.learn.result.computer.motherboard.MotherBoard;
import zx.learn.result.配置单.配置单;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 15:30
 * Description:
 */
@Slf4j
public class Intermediary {

    public static Intermediary intermediary;

    List<Store> storeList = new ArrayList<>();

    {
        storeList.add(new 商店());
        storeList.add(new JD());
    }

    public static Intermediary getInstance() {
        if (intermediary == null) {
            synchronized (Intermediary.class) {
                if (intermediary == null) {
                    Intermediary.intermediary = new Intermediary();
                } else {
                    return intermediary;
                }
            }
        } else {
            return intermediary;
        }
        return new Intermediary();
    }

    private Intermediary() {

    }

    public Computer getComputer(配置单 c) throws Exception {
        CPU cpu = CPUFactory.getCpu(c.getCpuInfo());
        Memory memory = Memory.getMemory(c.getMemoryInfo());
        MotherBoard motherBoard = MotherBoard.getMotherBoard(c.getMotherBoardInfo());

        cpu.setPrice(cpu.getPrice());
        memory.setPrice(memory.getPrice());
        motherBoard.setPrice(motherBoard.getPrice());

        return new AbstractComputerWrapper(new AbstractComputer(motherBoard, cpu, memory));

    }

    public Computer getComputer(String cpuId, String motherBoardId, String memoryId) throws Exception {
        CPU cpu = (CPU) getLowCommodity(cpuId);
        Memory memory = (Memory) getLowCommodity(memoryId);
        MotherBoard motherBoard = (MotherBoard) getLowCommodity(motherBoardId);

        cpu.setPrice(cpu.getPrice() * 1.2);
        memory.setPrice(memory.getPrice() * 2);
        motherBoard.setPrice(motherBoard.getPrice() * 1.5);

        return new AbstractComputerWrapper(new AbstractComputer(motherBoard, cpu, memory));
    }

    public Commodity getLowCommodity(String id) throws Exception {
        Commodity commodity = null;
        for (Store store : storeList) {

            Commodity newCommodity = store.getCommodity(id);
            if (commodity == null) {
                commodity = newCommodity;
            }
            if (newCommodity.getPrice() < commodity.getPrice()) {
                commodity = newCommodity;
                log.info(store.getName() + "的货价格更低，用他家的");
            }

        }
        return commodity;
    }


    public Commodity getCommodity(String id) throws Exception {
        throw new Exception("不单卖配件");
    }


    public List<String> getCommodityList() {
//        List<String> strings = new ArrayList<>();
//        for (Store store : storeList) {
//            strings.addAll(store.getCommodityList());
//        }
//        return strings;
        Set<String> keys = new HashSet<>();
        HashMap<String, Commodity> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        for (Store store : storeList) {
            HashMap<String, Commodity> stringCommodityHashMap = store.getCommodityList();
            for (String s : stringCommodityHashMap.keySet()) {
                if (!keys.contains(s)) {
                    keys.add(s);
                    map.put(s, stringCommodityHashMap.get(s));
                }
            }
        }
        map.forEach((k, v) -> strings.add("ID: " + k + "  " + v.introduce()));
        return strings;
    }
}
