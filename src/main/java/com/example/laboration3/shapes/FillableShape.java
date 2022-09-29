package com.example.laboration3.shapes;

import javafx.scene.paint.Color;

abstract public class FillableShape extends Shape {
    private boolean filled;

    protected FillableShape(boolean filled, Color color) {
        setColor(color);
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
