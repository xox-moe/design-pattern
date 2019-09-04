package zx.learn.模板方法模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/4
 * Time: 10:12
 * Description:
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon...");
    }

    @Override
    public boolean customerWantsCondiments() {
        if ("y".equals(getUserInput().toLowerCase())) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "n";
        }
        return answer;
    }
}
