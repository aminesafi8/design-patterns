package tn.aminesafi.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Drawing implements Shape {

    //collection of Shapes
    private final List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        shapes.forEach(shape -> shape.draw(fillColor));
    }

    //adding shape to drawing
    public void add(Shape shape) {
        shapes.add(shape);
    }

    //removing shape from drawing
    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    //removing all the shapes
    public void clear() {
        log.info("Clearing all the shapes from drawing");
        shapes.clear();
    }
}