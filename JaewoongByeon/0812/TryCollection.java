import java.util.ArrayList;
import java.util.HashMap;

public class TryCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49);
        list2.add(900);
        list2.add(123);
        list2.add(23);
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("str", list);
        hmap.put("integer", list2);
        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
        outlist01.add = (ArrayList<Integer>) hmap.get("integer");
    }
}