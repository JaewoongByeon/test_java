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
        outlist01 = (ArrayList<Integer>) hmap.get("integer");
        ArrayList<String> outlist02 = new ArrayList<String>();
        outlist02 = (ArrayList<String>) hmap.get("str");
        for (int i = 0; i < outlist01.size(); i++) {
            System.out.printf("\nlist1 [" + i + "] = " + outlist01.get(i));
        }
        for (int i = 0; i < outlist02.size(); i++) {
            System.out.printf("\nlist2 [" + i + "] = " + outlist02.get(i));
        }
    }
}