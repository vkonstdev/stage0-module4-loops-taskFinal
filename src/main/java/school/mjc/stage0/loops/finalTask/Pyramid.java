package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int num = 1;
        int numberOfSpaces = cathetusLength - 1;
        for (int i = 1; i <= cathetusLength; i++) {
            printSpaces(numberOfSpaces);
            for (int j = num; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= num; j++) {
                System.out.print(j);
            }
            //printSpaces(numberOfSpaces);
            /*if (i != cathetusLength) {
                System.out.println();
            }*/
            System.out.println();
            numberOfSpaces--;
            num++;
        }
    }
    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }
}
