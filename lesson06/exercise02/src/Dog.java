class Dog {
    String name;
    int weight;
    String type;
    int mood;

    Dog (){
        weight = 10;
        type = "Terrier";
        mood = 5;
    }

    void eat() {
        mood++;
        if (mood>10)
            mood=10;
    }

    void bark() {
        if (mood>5)
            System.out.println("Woof woof woof");
        else
            System.out.println("Woof");
    }

    void walk() {
        mood++;
        if (mood>10)
            mood=10;
    }

}
