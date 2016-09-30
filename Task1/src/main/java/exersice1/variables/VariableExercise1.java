package exersice1.variables;

import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.StrictMath.pow;

/**
 * Created by Viktoryia_Kastsiukov on 9/20/2016.
 */
public class VariableExercise1 {

    private double x = 0;
    private double y = 0;

    public VariableExercise1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double formula(VariableExercise1 variable){

        double value = (1 + pow(sin(variable.getX() + variable.getY()), 2)) / (2 + abs((2 * variable.getX())
                / (1 + pow(variable.getX(), 2) * pow(variable.getY(), 2)))) + variable.getX();
        return value;
    }

}
