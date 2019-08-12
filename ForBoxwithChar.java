public class ForBoxwithChar {
    public static void main(String args[]) {
        int row, col;
        for (row = 0; row < 7; row++) {
            for (col = 0; col < 3; col++) {
                if (col == 0) {
                    if (row == 0 || row == 6) {
                        System.out.printf("~ ");
                    } else {
                        System.out.printf("! ");
                    }
                }
                if (row == 0 || row == 6) {
                    System.out.printf("~ ");
                } else {
                    int prt;
                    prt = row + (col * 5);
                    System.out.printf(prt + " ");
                }
                if (col == 2) {
                    if (row == 0 || row == 6) {
                        System.out.printf("~");
                    } else {
                        System.out.printf("!");
                    }
                }
            }
            System.out.printf("\n");
        }
    }
}