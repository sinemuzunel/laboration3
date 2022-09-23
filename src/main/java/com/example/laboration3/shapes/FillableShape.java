package com.example.laboration3.shapes;

abstract public class FillableShape extends Shape {
    private boolean filled;

    protected FillableShape(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
