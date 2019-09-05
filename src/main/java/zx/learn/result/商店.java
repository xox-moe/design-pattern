package zx.learn.result;

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
public class 商店 implements Store {

    Store successor;


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
            commodity = successor.getCommodity(id);
        }
        return commodity;
    }


    /**
     * 获取本店有的 商品 List
     * @return
     */
    public List<String> getCommodityList() {
        List<String> strings = new ArrayList<>();
        for (String s : hashMap.keySet()) {
            strings.add("ID:" + s + "  " +hashMap.get(s).introduce() + "来自商店");
        }
        strings.addAll(successor.getCommodityList());
        return strings;
    }


}
