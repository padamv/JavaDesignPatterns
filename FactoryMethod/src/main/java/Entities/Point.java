package Entities;

public class Point {

    private double x, y;

    private Point(double a, double b, CoordinateSystem coordinateSystem) {
        switch (coordinateSystem) {
            case CARTESIAN -> {
                this.x = a;
                this.y = b;
            }
            case POLAR -> {
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
            }
        }
    }

    public static Point newCartesianPoint(double x, double y ){
        return new Point(x, y, CoordinateSystem.CARTESIAN);
    }

    public static Point newPolarPoint(double rho, double theta){
        return new Point(rho, theta, CoordinateSystem.POLAR);
    }
}
