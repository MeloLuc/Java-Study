package triangulo.entities;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {

    private double xA, xB, xC;

    public Triangle(double xA,double xB,double xC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
    }

    public Triangle() {
        inputTriangle();
    }

    private void inputTriangle() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measures of triangle:");
        this.xA = sc.nextDouble();
        this.xB = sc.nextDouble();
        this.xC = sc.nextDouble();
        sc.close();
    }

    public double area() {
        double p = (xA + xB + xC) / 2.0;
        return Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));
        
    }

    public Triangle compareLargeTriangle(Triangle triangle2) {
        if(this.area() > triangle2.area()) {
            return this;
        }
        else if(this.area() == triangle2.area()){
            return null;
        }
        else {
            return triangle2;
        }
    }
}
