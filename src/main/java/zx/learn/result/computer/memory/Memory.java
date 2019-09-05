package zx.learn.result.computer.memory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zx.learn.result.computer.Commodity;
import zx.learn.result.配置单.MemoryInfo;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 13:37
 * Description:
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Memory extends Commodity {

    String brand;
    int size;
    int frequency;
    double price;

    public String introduce() {
        return "ID:"+id+  "  品牌：" + brand + "  大小:" + size + "GB  频率:" + frequency + "M Hz  价格:" + price ;
    }

    public MemoryInfo getMemoryInfo() {
        return new MemoryInfo(brand, size, frequency, price);
    }

    public static Memory getMemory(MemoryInfo info) {
        Memory memory = new Memory();
        memory.brand = info.getBrand();
        memory.size = info.getSize();
        memory.frequency = info.getFrequency();
        memory.price = info.getPrice();
        return memory;
    }

}
