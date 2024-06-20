package inheritanceAndPolymorphism.abstracts.entites;

import inheritanceAndPolymorphism.abstracts.entites.enums.Color;

public abstract class Shape {
    
    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //abstract method -> class abstract
    public abstract double area();
    
}
