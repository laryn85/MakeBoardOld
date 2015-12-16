package mytest;

public class MyTest {

    private static final int[] MAKEBOARD = new int[42];
    private int[] makeBoardOld;

    public static void main(String[] args) {
        MyTest mt = new MyTest();
        mt.makeBoard();
        for (int i = 0; i < MAKEBOARD.length; i++) {
            System.out.println(MAKEBOARD[i]);
        }
    }

    public int getMakeBoard(int i) {

        return MAKEBOARD[i];
    }

    public int getMakeBoardLength() {
        return MAKEBOARD.length;
    }

    public void makeBoard() {
        int x = 1;
        for (int i = 0; i < MAKEBOARD.length; i++) {
            while (x <= 60) {
                if (x <= 20) {
                    MAKEBOARD[i] = x;
                    x++;
                    break;
                } else if (x == 50) {
                    MAKEBOARD[i] = x;
                    x++;
                    break;
                } else if (x > 20 && x % 3 == 0) {
                    MAKEBOARD[i] = x;
                    x++;
                    break;
                } else if (x > 20 && x % 2 == 0 && x <= 40) {
                    MAKEBOARD[i] = x;
                    x++;
                    break;
                }
                x++;
            }
        }

    }

    public void makeBoardOld() {
        makeBoardOld = new int[42];
        for (int i = 0; i < makeBoardOld.length; i++) {
            if (i < 20) {
                makeBoardOld[i] = i + 1;
            }
            makeBoardOld[i] = 21;
            makeBoardOld[i] = 22;
            makeBoardOld[i] = 24;
            makeBoardOld[i] = 26;
            makeBoardOld[i] = 27;
            makeBoardOld[i] = 28;
            makeBoardOld[i] = 30;
            makeBoardOld[i] = 32;
            makeBoardOld[i] = 33;
            makeBoardOld[i] = 34;
            makeBoardOld[i] = 36;
            makeBoardOld[i] = 38;
            makeBoardOld[i] = 39;
            makeBoardOld[i] = 40;
            makeBoardOld[i] = 42;
            makeBoardOld[i] = 45;
            makeBoardOld[i] = 48;
            makeBoardOld[i] = 50;
            makeBoardOld[i] = 51;
            makeBoardOld[i] = 54;
            makeBoardOld[i] = 47;
            makeBoardOld[i] = 60;
        }
    }
}
