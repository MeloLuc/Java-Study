package generics.wildcardTypes.wildcardBounded;

import java.util.ArrayList;
import java.util.List;

//curingas delimitados
public class Program {
    
    public static void main(String[] args) {
        
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(2.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("TOTAL AREA: " + String.format("%.2f", totalArea(myShapes)));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("TOTAL AREA: " + String.format("%.2f", totalArea(myCircles)));


        List<Rectangle> myRectangles = new ArrayList<>();
        myRectangles.add(new Rectangle(2.0, 4.0));
        myRectangles.add(new Rectangle(3.0, 6.0));

        System.out.println("TOTAL AREA: " + String.format("%.2f", totalArea(myRectangles)));
    }

    //wildcard bounded
    public static double totalArea(List<? extends Shape> list) { 
        
        double sum = 0.0;
        for(Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

    //I can't use List<Shape> because this will not receive List<Circle> or List<Rectangle>
    //and I can't use List<?> because it will receive classes that don't implement Shape
    // --> THEREFORE I USE WILDCARD BOUNDED / DELIMITED
}
