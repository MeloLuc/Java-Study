package triangulo.aplication;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class ProgramNoPoo {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));

        System.out.printf("triangle X area: %.3f%n", areaX);
        System.out.printf("triangle Y area: %.3f%n", areaY);

        if (areaX > areaY) {
            System.out.println("larger area: X");
        }
        else if(areaX == areaY){
            System.out.println("equals areas");
        }
        else {
            System.out.println("Large triangle: Y");
        }

        sc.close();
    }
}
