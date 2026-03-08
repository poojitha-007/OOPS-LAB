class PrivateExample {

    private int num = 10;

    public void display() {
        System.out.println("Number is " + num);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.display();
    }
}