public class TryCallmethod {
    static int globalValue = 20;

    public static void main(String[] args) {
        int localValue = 50;
        System.out.printf("\nbefore change: " + localValue);
        TryCallmethod global = new TryCallmethod();
        localValue = global.change(500);
        System.out.printf("\nafter change: " + localValue);
        System.out.printf("\nglobal: " + globalValue);
    }

    public int change(int data) {
        int retrunValue;
        retrunValue = data + 100;
        return retrunValue;
    }
}