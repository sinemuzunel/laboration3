package com.example.laboration3.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Rectangle extends FillableShape{
    private double width;
    private double height;

    public Rectangle(double width, double height, boolean filled, Color color) {
        super(filled, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        super(false, Color.BLACK);
        this.width = 100;
        this.height = 50;
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
            gc.setFill(getColor());
            gc.fillRect(getX(), getY(), width, height);
        }else {
            gc.setStroke(getColor());
            gc.strokeRect(getX(), getY(), width, height);
        }
    }

    @Override
    protected void constrain(double boxX, double boxY, double boxWidth, double boxHeight) {
        double dx = getDx();
        double dy = getDy();
        super.constrain(boxX, boxY, boxWidth, boxHeight);
        if (getX() + width < boxX) {
            dx = Math.abs(dx);
            setVelocity(dx, dy);
        } else if (getX() + width > boxWidth) {
            dx = -Math.abs(dx);
            setVelocity(dx, dy);
        }

        if (getY() + height < boxY) {
            dy = Math.abs(dy);
            setVelocity(dx, dy);
        } else if (getY() + height > boxHeight) {
            dy = -Math.abs(dy);
            setVelocity(dx, dy);
        }


    }
}
