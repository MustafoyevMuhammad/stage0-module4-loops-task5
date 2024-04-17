package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
       if (sideLength==0){
            System.out.print("");
            return;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < sideLength; i++) {
            if (sideLength / 2 != i)
                {
                    for (int j = 0; j < sideLength; j++)
                    if (j != sideLength / 2)
                        s.append(" ");
                    else s.append("8");
                }
            else
                {
                    for (int j = 0; j < sideLength; j++)
                    s.append("8");
                }

                if (i!=sideLength-1)
            s.append("\n");
        }
        System.out.println(s);
    }
}
