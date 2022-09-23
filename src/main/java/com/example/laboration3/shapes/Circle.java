package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;

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
        gc.arcTo(0, 0, diameter, diameter, diameter/2);
    }

    public void constrain(double x1, double y1, double x2, double y2){

    }
}
