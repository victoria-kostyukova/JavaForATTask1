package exercise3;

import static java.lang.Math.tan;

/**
 * Created by Виктория on 27.09.16.
 */
public class Tangens {

    private double segmentA;
    private double segmentB;
    private double stepH;

    public Tangens(double segmentA, double segmentB, double stepH) {
        this.segmentA = segmentA;
        this.segmentB = segmentB;
        this.stepH = stepH;
    }

    public void countTangens(){
        double x = segmentA;
        while (x <= segmentB){
            System.out.printf("%10s %6.2f %10s %10f%n", "x = ", x, "tg(x) = ", tan(x));
            x = x + stepH;
        }
    }
}
