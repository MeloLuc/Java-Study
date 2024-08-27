package interface1.interfacePlusAbstractClass.model.entities;

import interface1.interfacePlusAbstractClass.model.enums.Color;

public abstract class AbstractShape implements Shape {
    private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
