package exercise2.variables;

/**
 * Created by Viktoryia_Kastsiukov on 9/20/2016.
 */
public class Point {

    private double x = 0;
    private double y = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isInRegion(){

        boolean isInArea = false;
        if (this.getX() >= Area.SECONDLEFTX.getNumber() && this.getX() <= Area.SECONDRIGHTX.getNumber() && this.getY() >= Area.BOTTOMY.getNumber() && this.getY() <= Area.TOPY.getNumber()){
            isInArea = true;
        }
        if (this.getX() >= Area.FIRSTLEFTX.getNumber() && this.getX() <= Area.SECONDLEFTX.getNumber() && this.getY() >= Area.BOTTOMY.getNumber() && this.getY() <= Area.CENTERY.getNumber()){
            isInArea = true;
        }
        if (this.getX() >= Area.SECONDRIGHTX.getNumber() && this.getX() <= Area.FIRSTRIGHTX.getNumber() && this.getY() >= Area.BOTTOMY.getNumber() && this.getY() <= Area.CENTERY.getNumber()){
            isInArea = true;
        }
        return isInArea;
    }

}
