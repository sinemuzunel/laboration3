package com.example.laboration3.shapes; // TODO: Change to your package name

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/**
 * A representation of a world containing a set of moving shapes. NB! The worlds
 * y-axis points downward.
 *
 * @author Anders Lindström, anderslm@kth.se 2021-09-15
 */
public class World {

    private static final int MAX_TICKS = 75;
    private double width, height; // this worlds width and height
    private int ticks = 0;
    private final ArrayList<Shape> shapes; // an array of references to the shapes

    /**
     * Creates a new world, containing a pad and a set of balls. NB! The worlds
     * y-axis points downward.
     *
     * @param width the width of this world
     * @param height the height of this world
     */
    public World(double width, double height) {
        this.width = width;
        this.height = height;

        shapes = new ArrayList<>();// an array of references (change to non-zero size)
        shapes.add(new Rectangle(100, 50, true, Color.BLUE));
        shapes.add(new Circle(30, true, Color.RED));
        shapes.add(new Circle(30, false, Color.ORANGE));
        shapes.add(new Line(100, 50, 40, 80, Color.BLACK));
        shapes.get(0).setVelocity(20, 40);
        shapes.get(1).setVelocity(30, 50);
        shapes.get(2).setVelocity(40, 60);
        shapes.get(3).setVelocity(50, 70);
        // Create the actual Shape objects (sub types)
        // ....
    }

    /**
     * Sets the new dimensions, in pixels, for this world. The method could be
     * used for example when the canvas is reshaped.
     *
     * @param newWidth
     * @param newHeight
     */
    public void setDimensions(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    /**
     * Move the world one step, based on the time elapsed since last move.
     *
     * @param elapsedTimeNs the elapsed time in nanoseconds
     */
    public void moveAndConstrain(long elapsedTimeNs) {
        // alterantive loop: for(Shape s : shapes) { ...

        for (Shape s : shapes) {
            s.moveAndConstrain(elapsedTimeNs, 0, 0, width, height);
            if (s instanceof FillableShape && ticks == MAX_TICKS){
                ((FillableShape) s).setFilled(!(((FillableShape) s).isFilled()));

            }
        }
        if (ticks == MAX_TICKS){
            ticks = 0;
        }
        ticks++;
    }

    /**
     * Returns a copy of the list of ball references.
     * Due to the implementation of clone, a shallow copy is returned.
     *
     * @return a copy of the list of balls
     */
    public List<Shape> getShapes() {
        return (List<Shape>) shapes.clone();
    }
}
