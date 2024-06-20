package inheritanceAndPolymorphism.abstracts.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inheritanceAndPolymorphism.abstracts.entites.Circle;
import inheritanceAndPolymorphism.abstracts.entites.Rectangle;
import inheritanceAndPolymorphism.abstracts.entites.Shape;
import inheritanceAndPolymorphism.abstracts.entites.enums.Color;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>(); //shape is abstract - upcasting

        System.out.println();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println(i+"# SHAPE DATA");
            System.out.print("Rectangle or Circle (r|c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Color (BLACK | BLUE | RED): "); //enumerats
            Color colorEnumerate = Color.valueOf(sc.next());

            if(type == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(colorEnumerate, width, height)); //upcasting - polymorphism
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(colorEnumerate, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPES AREAS");
        for(Shape s : list) {
        System.out.println(String.format("%.2f",s.area())); //method area is a method abstract of Shape
        }

        sc.close();
    }
}
