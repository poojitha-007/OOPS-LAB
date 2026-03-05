class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.display();
        r.drawRectangle();
    }
}