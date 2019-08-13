import java.util.ArrayList;
import java.util.HashMap;

public class TryCollection2 {
    public static void main(String[] args) {
        ArrayList<String> Fruit = new ArrayList<String>();
        Fruit.add("Mango");
        Fruit.add("Apple");
        Fruit.add("Banana");
        Fruit.add("Melon");
        ArrayList<Integer> Mango = new ArrayList<Integer>();
        Mango.add(39);
        Mango.add(20);
        Mango.add(30);
        Mango.add(12);
        Mango.add(40);
        ArrayList<Integer> Apple = new ArrayList<Integer>();
        Apple.add(48);
        Apple.add(20);
        Apple.add(10);
        Apple.add(32);
        ArrayList<Integer> Banana = new ArrayList<Integer>();
        Banana.add(99);
        Banana.add(23);
        Banana.add(123);
        ArrayList<Integer> Melon = new ArrayList<Integer>();
        Melon.add(49);
        Melon.add(22);
        Melon.add(45);
        Melon.add(12);
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("Fruit", Fruit);
        hmap.put("Mango", Mango);
        hmap.put("Apple", Apple);
        hmap.put("Banana", Banana);
        hmap.put("Melon", Melon);
        ArrayList<String> outfruit = new ArrayList<String>();
        outfruit = (ArrayList<String>) hmap.get("Fruit");
        for (int i = 0; i < outfruit.size(); i++) {
            ArrayList<Integer> outlist = new ArrayList<Integer>();
            outlist = (ArrayList<Integer>) hmap.get(outfruit.get(i));
            System.out.printf("\n" + outfruit.get(i) + " :");
            for (int j = 0; j < outlist.size(); j++) {
                System.out.printf(" " + outlist.get(j));
            }
        }
    }
}