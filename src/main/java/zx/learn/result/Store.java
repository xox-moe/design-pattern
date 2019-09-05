package zx.learn.result;

import zx.learn.result.computer.Commodity;

import java.util.HashMap;
import java.util.List;

public interface Store {
    String getName();

    Commodity getCommodity(String id) throws Exception;

    public HashMap<String, Commodity> getCommodityList();
}
