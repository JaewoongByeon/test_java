public class TryFor {
    public static void main(String args[]) {
        int i, j;
        for (i = 0; i < 5; i++) {
            System.out.printf("i is :" + i);
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.printf("i is : " + i + ", j is : " + j);
            }
        }
        String[] names = { "James", "Larry", "Tom", "Lacy" };
        for (String name : names) {
            System.out.printf(name + ",");
        }
    }
}