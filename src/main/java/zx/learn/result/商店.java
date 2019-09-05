package zx.learn.result;

import lombok.extern.slf4j.Slf4j;
import zx.learn.result.computer.Commodity;
import zx.learn.result.computer.cpu.CPUFactory;
import zx.learn.result.computer.memory.Memory;
import zx.learn.result.computer.motherboard.BoardSize;
import zx.learn.result.computer.motherboard.MotherBoard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 15:34
 * Description:
 */

@Slf4j
public class 商店 implements Store {

    Store successor;

    String name = "商店";


    public String getName() {
        return name;
    }


    HashMap<String,Commodity> hashMap = new HashMap();
    {
        try {
            hashMap.put("1", CPUFactory.getCpu("AMD", "Ryzen 7", 12, 24, 3999));
            hashMap.put("2", CPUFactory.getCpu("Intel", "Core i7", 8, 16, 3899));
            hashMap.put("5", new MotherBoard("MSI", BoardSize.MATX, 2999));
            hashMap.put("9", new Memory("Kingston", 8,2666, 249));
        } catch (Exception e) {
            e.printStackTrace();
        }
        successor = new 仓库();
    }

    /**
     * 从店里拿 CPU 店从哪里拿不管
     *
     * @param id
     * @return
     */
    public Commodity getCommodity(String id) throws Exception {
        Commodity commodity = hashMap.get(id);
        if (commodity == null) {
            log.info("从商店没拿到货，去仓库看看看");
            commodity = successor.getCommodity(id);
        } else {
            log.info("从商店拿到了货 " + id + " ，结束");
        }

        return commodity;
    }


    /**
     * 获取本店有的 商品 List
     * @return
     */
    @Override
    public HashMap<String,Commodity> getCommodityList() {
//        List<Commodity> commodities = new ArrayList<>();
//        hashMap.keySet().forEach(k -> commodities.add(hashMap.get(k)));
//        return commodities;
        return hashMap;
    }


}
