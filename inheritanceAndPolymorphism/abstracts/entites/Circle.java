package inheritanceAndPolymorphism.abstracts.entites;

import inheritanceAndPolymorphism.abstracts.entites.enums.Color;

// methods abstracts inherits must be override
public class Circle extends Shape {

    private Double radius;

    public Circle(){
        super();
    }
    
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
}
