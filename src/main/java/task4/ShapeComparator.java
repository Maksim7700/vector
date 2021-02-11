package task4;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getArea(),o2.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
