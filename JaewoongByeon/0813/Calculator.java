import java.util.ArrayList;
import java.util.HashMap;

public class Calculator {

    public static void main(String[] args) {
        Calculator global = new Calculator();
        global.Print(2, 2);
    }

    public int Addition(int x, int y) {
        return x + y;
    }

    public int Subtraction(int x, int y) {
        return x - y;
    }

    public int Multiplication(int x, int y) {
        return x * y;
    }

    public int Division(int x, int y) {
        return x / y;
    }

    public HashMap<String, Integer> Result(int x, int y) {
        Calculator global = new Calculator();
        HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
        resultMap.put("Addition", global.Addition(x, y));
        resultMap.put("Subtraction", global.Subtraction(x, y));
        resultMap.put("Multiplication", global.Multiplication(x, y));
        resultMap.put("Division", global.Division(x, y));
        return resultMap;
    }

    public void Print(int x, int y) {
        Calculator global = new Calculator();
        System.out.printf("Enter: " + x + " " + y + "\n");
        for (String key : global.Result(x, y).keySet()) {
            System.out.printf(key + ": " + global.Result(x, y).get(key) + "\n");
        }
    }
}