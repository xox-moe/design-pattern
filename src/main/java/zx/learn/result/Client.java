package zx.learn.result;

import lombok.extern.slf4j.Slf4j;
import zx.learn.result.computer.Computer;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/5
 * Time: 9:47
 * Description:
 */

@Slf4j
public class Client {

    public static void main(String[] args) throws Exception {

        Intermediary i = Intermediary.getInstance();
        i.getCommodityList().forEach(System.out::println);

        System.out.println("请以此输入您需要的 CPU 主板 内存 的ID");

        Scanner scanner = new Scanner(System.in);

        String cpuId = scanner.next();
        String motherBoardId = scanner.next();
        String memoryId = scanner.next();

        log.info("输入的ID: " + cpuId + "   " + motherBoardId + "     " + memoryId);

        Computer computer = i.getComputer(cpuId, motherBoardId, memoryId);

        System.out.println(computer.introduce());


    }

}
