public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse(110,300,"Brown","Fluffy");
        Doberman doberman = new Doberman(43,45,15);
        Bulldog bulldog = new Bulldog(36,52,23, "Medium");

        System.out.println("The color of the Horse is: " + horse.getColor());

        doberman.bark();
        doberman.run();
        doberman.bark();
        
        bulldog.bark();
        bulldog.sleep();
        bulldog.sleep();
    }
}