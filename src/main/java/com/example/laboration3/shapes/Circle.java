package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Circle extends FillableShape {
    private double diameter;

    public Circle(double diameter, boolean filled, Color color) {
        super(filled, color);
        this.diameter = diameter;
    }

    public Circle(){ //parameterlös konstruktur
        super(false, Color.BLACK);
        this.diameter = 50;
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
           gc.setFill(getColor());
           gc.fillArc(getX(), getY(), diameter, diameter, 0, 360, ArcType.OPEN);
       }else {
           gc.setStroke(getColor());
           gc.strokeArc(getX(), getY(), diameter, diameter, 0, 360, ArcType.OPEN);
       }
    }

    @Override
    protected void constrain(double boxX, double boxY, double boxWidth, double boxHeight) {
        double dx = getDx();
        double dy = getDy();
        super.constrain(boxX, boxY, boxWidth, boxHeight);
        if (getX() + diameter < boxX) {
            dx = Math.abs(dx);
            setVelocity(dx, dy);
        } else if (getX() + diameter > boxWidth) {
            dx = -Math.abs(dx);
            setVelocity(dx, dy);
        }

        if (getY() + diameter < boxY) {
            dy = Math.abs(dy);
            setVelocity(dx, dy);
        } else if (getY() + diameter > boxHeight) {
            dy = -Math.abs(dy);
            setVelocity(dx, dy);
        }

    }
}
