package zx.learn.result;

import lombok.extern.slf4j.Slf4j;
import zx.learn.result.computer.Commodity;
import zx.learn.result.computer.cpu.CPUFactory;
import zx.learn.result.computer.memory.Memory;
import zx.learn.result.computer.motherboard.BoardSize;
import zx.learn.result.computer.motherboard.MotherBoard;
import zx.learn.result.computer.cpu.CPU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 15:41
 * Description: 京东
 */

@Slf4j
public class JD implements Store {

    String name = "JD";


    public String getName() {
        return name;
    }


    HashMap<String,Commodity> hashMap = new HashMap();
    {
        try {
            hashMap.put("1", CPUFactory.getCpu("AMD", "Ryzen 7", 12, 24, 3799));
            hashMap.put("2", CPUFactory.getCpu("Intel", "Core i7", 8, 16, 1699));
            hashMap.put("4", new MotherBoard("MSI", BoardSize.ITX, 899));
            hashMap.put("5", new MotherBoard("MSI", BoardSize.MATX, 2799));
            hashMap.put("6", new MotherBoard("ASUS", BoardSize.ATX, 1999));
            hashMap.put("7", new Memory("芝奇", 8,3600, 599));
            hashMap.put("8", new Memory("芝奇", 16,3200, 1399));
            hashMap.put("9", new Memory("Kingston", 8,2666, 249));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 从店里拿 CPU 店从哪里拿不管
     *
     * @param id
     * @return
     */
    public CPU getCpu(String id) {
        return null;
    }

    public MotherBoard getMotherBoard(String id) {
        return null;
    }

    public Memory getMemory(String id) {
        return null;
    }


    @Override
    public Commodity getCommodity(String id) throws Exception {
        log.info("从 JD 拿到了货 " + id + " ，结束");
        return hashMap.get(id);
    }

    /**
     * 获取本店有的 商品 List
     * @return
     */
    @Override
    public HashMap<String,Commodity> getCommodityList() {
        return hashMap;
    }

}
