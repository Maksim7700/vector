package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(2));
        shapeList.add(new Rectangle(3,5));
        shapeList.add(new Square(5));
        shapeList.add(new Triangle(3,5));
        Collections.sort(shapeList, new ShapeComparator());
        System.out.println(shapeList);
    }
}
