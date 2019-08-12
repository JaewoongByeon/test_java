import java.util.ArrayList;

public class TryArrayList {
    public static void main(String args[]) {
        java.util.ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        System.out.printf("\nThe arraylist contains elements: " + list);
        int pos = list.indexOf("Item2");
        System.out.printf("\nThe index of Item2 is: " + pos);
        System.out.printf("\nChecking is empty: " + list.isEmpty());
        int size = list.size();
        System.out.printf("\nThe size of the list is: " + size);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("\nIndex: " + i + " - Item: " + list.get(i));
        }
    }
}