class Animal {
    protected String name = "Dog";
}

class ProtectedExample extends Animal {

    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Animal name is " + obj.name);
    }
}