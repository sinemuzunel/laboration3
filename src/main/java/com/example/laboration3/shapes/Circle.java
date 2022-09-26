package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Circle extends FillableShape {
    private double diameter;

    public Circle(double diameter, boolean filled) {
        super(filled);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void paint(GraphicsContext gc){
       if(isFilled()){
           gc.setFill(Color.RED);
           gc.fillArc(getX(), getY(), diameter, diameter, 0, 360, ArcType.OPEN);
       }else {
           gc.setStroke(Color.RED);
           gc.strokeArc(getX(), getY(), diameter, diameter, 0, 360, ArcType.OPEN);
       }
    }

    @Override
    protected void constrain(double boxX, double boxY, double boxWidth, double boxHeight) {
        super.constrain(boxX, boxY, boxWidth, boxHeight);
    }
}
