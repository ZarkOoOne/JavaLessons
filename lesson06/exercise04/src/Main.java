class Main {
    public static void main(String[] args) {
        Dog piko = new Dog();
        piko.name = "Piko";

        piko.bark();
        piko.walk();
        piko.bark();
        piko.walk();
        piko.bark();
        piko.eat(2);
        piko.bark();
    }
}