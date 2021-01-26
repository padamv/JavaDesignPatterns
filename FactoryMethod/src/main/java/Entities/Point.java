package Entities;

public class Point {

    private double x, y;

    public Point(double a, double b, CoordinateSystem coordinateSystem) {
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
}
