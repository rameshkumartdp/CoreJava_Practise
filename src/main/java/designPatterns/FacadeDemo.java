package designPatterns;

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}

class ShapeMaker {
    Shape circle;
    Shape rectangle;
    Shape square;

    ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}

class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
