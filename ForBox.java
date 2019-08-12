public class ForBox {
    public static void main(String args[]) {
        int row, col;
        for (row = 1; row < 6; row++) {
            for (col = 0; col < 5; col++) {
                int prt;
                prt = row + (col * 5);
                System.out.printf(prt + " ");
            }
            System.out.printf("\n");
        }
    }
}