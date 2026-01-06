class DataOperations{
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        int x = 5;
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
       
        int m = 10;
        int n = 20;

        System.out.println("m < n : " + (m < n));
        System.out.println("m <= n : " + (m <= n));
        System.out.println("m > n : " + (m > n));
        System.out.println("m >= n : " + (m >= n));
        System.out.println("m == n : " + (m == n));
        System.out.println("m != n : " + (m != n));

       
        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));
    }
}
