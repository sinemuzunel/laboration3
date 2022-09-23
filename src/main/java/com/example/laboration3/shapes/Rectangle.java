package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends FillableShape{
    private double width;
    private double height;

    public Rectangle(double width, double height, boolean filled) {
        super(filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void paint(GraphicsContext gc) {

    }

    public void constrain(double x1, double y1, double x2, double y2){

    }
}
