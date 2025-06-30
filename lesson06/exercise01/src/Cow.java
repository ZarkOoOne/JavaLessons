class Cow {
    int weight;
    int hunger;

    Cow(){
        weight = 500;
        hunger = 10;
    }

    void express() {
        if (hunger > 5)
            System.out.println("Mooooooooowwwwwwwww");
        else
            System.out.println("Moooww");
    }
}
