class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(2, 3));       
        System.out.println(obj.add(2, 3, 4));    
        System.out.println(obj.add(2.5, 3.5));   
    }
}