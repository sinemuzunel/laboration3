package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape{
    private double x2;
    private double y2;

    public Line(double x2, double y2, Color color) {
        super(x2, y2, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void paint(GraphicsContext gc){
        gc.strokeLine(0, 0, this.x2, this.y2);
    }

    public void constrain(double x1, double y1, double x2, double y2){

    }


}
