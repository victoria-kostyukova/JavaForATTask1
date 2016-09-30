package exercise2.variables;

/**
 * Created by Виктория on 27.09.16.
 */
public enum  Area {

    FIRSTLEFTX(-6),
    SECONDLEFTX(-4),
    FIRSTRIGHTX(6),
    SECONDRIGHTX(4),

    BOTTOMY(-3),
    CENTERY(0),
    TOPY(5);

    private double number;

    Area(int number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}
