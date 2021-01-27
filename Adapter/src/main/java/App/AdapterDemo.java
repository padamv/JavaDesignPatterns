package App;

import Adapters.LineToPointAdapter;
import Entities.Line;
import Entities.Point;
import Entities.VectorObject;
import Entities.VectorRectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    private static final List<VectorObject> vectorObjects =
            new ArrayList<> (Arrays.asList(
                    new VectorRectangle(1, 1, 10, 10),
                    new VectorRectangle(3, 3, 6, 6)
            ));

    public static void drawPoint(Point p){
        System.out.println(".");
    }

    private static void draw(){
        for (VectorObject vectorObject : vectorObjects){
            for(Line line : vectorObject){
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach((point -> drawPoint(point)));
            }
        }
    }

    public static void main(String[] args) {
        draw();
        draw();
    }
}
