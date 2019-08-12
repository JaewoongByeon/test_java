import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Map;

public class TryHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(12, "Chaitanya");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.printf("\nkey: " + mentry.getKey() + " & value: " + mentry.getValue());
        }
        for (Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.printf("\nkey: " + entry.getKey() + " & value: " + entry.getValue());
        }
        for (Integer key : hmap.keySet()) {
            System.out.printf("\nkey: " + key + " & value: " + hmap.get(key));
        }
    }
}