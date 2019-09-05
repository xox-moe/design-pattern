package zx.learn.result;

import zx.learn.result.computer.Commodity;

import java.util.List;

public interface Store {

    Commodity getCommodity(String id) throws Exception;

    public List<String> getCommodityList();
}
