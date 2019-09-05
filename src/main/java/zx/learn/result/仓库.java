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
 * Time: 15:36
 * Description: 商店仓库
 */
public class 仓库 implements Store {

//    Store successor;

    HashMap<String, Commodity> hashMap = new HashMap();

    {
        try {
            hashMap.put("1", CPUFactory.getCpu("AMD", "Ryzen 7", 12, 24, 3999));
            hashMap.put("2", CPUFactory.getCpu("Intel", "Core i7", 8, 16, 3899));
            hashMap.put("3", CPUFactory.getCpu("Intel", "Core i5", 8, 8, 2499));
            hashMap.put("4", new MotherBoard("MSI", BoardSize.ITX, 899));
            hashMap.put("5", new MotherBoard("MSI", BoardSize.MATX, 2999));
            hashMap.put("6", new MotherBoard("ASUS", BoardSize.ATX, 1999));
            hashMap.put("7", new Memory("芝奇", 8,3600, 599));
            hashMap.put("8", new Memory("芝奇", 16,3200, 1399));
            hashMap.put("9", new Memory("Kingston", 8,2666, 249));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public Commodity getCommodity(String id) throws Exception {
        Commodity commodity = hashMap.get(id);

        if (commodity == null) {
//            commodity = successor.getCommodity(id);
            throw new Exception("没有该商品");
        }

        return commodity;
    }

    @Override
    public List<String> getCommodityList() {
        List<String> strings = new ArrayList<>();
        for (String s : hashMap.keySet()) {
            strings.add("ID:" + s + "  " + hashMap.get(s).introduce() + "来自仓库");
        }
        return strings;
    }
}
