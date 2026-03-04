class Rectangle {
    int length, breadth;
    Rectangle() {
        length = 1;
        breadth = 1;
    }
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 4);

        r1.area();
        r2.area();
    }
}