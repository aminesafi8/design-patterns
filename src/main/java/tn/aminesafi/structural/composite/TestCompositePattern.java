package tn.aminesafi.structural.composite;

class TestCompositePattern {

    public static void main(String[] args) {
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle2);
        drawing.add(triangle2);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangle1);
        drawing.add(circle);
        drawing.draw("Green");
    }

}