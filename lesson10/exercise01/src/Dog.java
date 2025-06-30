class Dog extends Animal {
    private int dB;

    public Dog(int height, int weight, int dB) {
        super(height, weight);
        this.dB = dB;
    }

    public int getdB() {
        return dB;
    }

    public void setdB(int dB) {
        this.dB = dB;
    }

    public void bark(){
        System.out.println("woof woof");
    }
}
