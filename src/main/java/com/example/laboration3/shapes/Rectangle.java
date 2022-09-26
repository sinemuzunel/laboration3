package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

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
        if(isFilled()){
            gc.setFill(Color.RED);
            gc.fillRect(getX(), getY(), width, height);
        }else {
            gc.setStroke(Color.RED);
            gc.strokeRect(getX(), getY(), width, height);
        }
    }

    @Override
    protected void constrain(double boxX, double boxY, double boxWidth, double boxHeight) {
        super.constrain(boxX, boxY, boxWidth, boxHeight);
    }
}
