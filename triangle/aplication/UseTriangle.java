package triangle.aplication;

import triangle.entities.Triangle;

public class UseTriangle {

        public static void main(String[] args) {
            
            Triangle x = new Triangle(4.00, 5.00, 6.00);
            Triangle y = new Triangle();

            System.out.printf("triangle X area: %.3f%n", x.area());
            System.out.printf("triangle Y area: %.3f%n", y.area());

            
            if(x.equals(x.compareLargeTriangle(y))) {
                System.out.println("Large triangle: X");
            }
            else if(x.compareLargeTriangle(y) == null){ //null is returned when areas are equals
                System.out.println("triangles with equal areas");
            }
            else {
                System.out.println("Large triangle: Y");
            }
        }
}
