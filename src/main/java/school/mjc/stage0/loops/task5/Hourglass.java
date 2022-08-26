package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        boolean ok = false;
        for (int i = 0; i < height/2; i++) {
            for (int j = 0; j < height; j++) {
                if(j == i) {
                    System.out.print(8);
                    ok =true;
                }
                else if(j + i == height - 1){
                    System.out.print(8);
                    ok = false;
                }
                else if(ok){
                    System.out.print(8);
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
        if (height % 2 != 0) {
            for (int i = 0; i < height/2; i++) {
                System.out.print(" ");
            }
            System.out.println(8);
        }
        ok = false;
        for (int i = height/2 + 1; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(j + i == height - 1){
                    System.out.print(8);
                    ok = true;
                }
                else if(j == i) {
                    System.out.print(8);
                    ok =false;
                }
                else if(ok){
                    System.out.print(8);
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
