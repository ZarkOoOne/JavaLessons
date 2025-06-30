class Main {
    public static void main (String[] args) {
        Dog piko = new Dog();

        piko.name="Piko";

        Dog lassie = new Dog();
        lassie.name = "Lassie";
        lassie.weight = 30;
        lassie.type = "Colley";

        System.out.println("Name: " + piko.name + "\nWeight: " + piko.weight + "\nType: " + piko.type);

    }
}