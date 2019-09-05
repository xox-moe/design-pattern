//package zx.learn.result.computer;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Type;
//import java.util.Scanner;
//
///**
// * Created with IntelliJ IDEA.
// * User: zx
// * Date: 2019/9/5
// * Time: 14:14
// * Description:
// */
//public class ConfigurationList {
//
//
//    String cpuBrand;
//    String cpuName;
//    double cpuPrice;
//    int cpuCoreNum;
//    int cpuThreadNum;
//
//
//    String motherBoardBrand;
//    String motherBoardName;
//    double motherBoardPrice;
//
//    String memoryBrand;
//    int memorySize;
//    int memoryFrequency;
//
//    public static ConfigurationList InputConfig() throws NoSuchMethodException, IllegalAccessException {
//        Class clazz = ConfigurationList.class;
//
//        ConfigurationList list = new ConfigurationList();
//
//        Field[] fields = clazz.getDeclaredFields();
//        Scanner scanner = new Scanner(System.in);
//        for (Field field : fields) {
//            System.out.println("请输入" + field.getName());
//            String str = scanner.nextLine();
//            Type type = field.getType();
//            field.set(list, str);
//        }
//        return list;
//    }
//
//
//}
