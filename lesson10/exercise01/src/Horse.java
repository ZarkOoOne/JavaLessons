class Horse extends Animal{
    private String color;
    private String tail;

    public Horse(int height, int weight, String color, String tail) {
        super(height, weight);
        this.color = color;
        this.tail = tail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

}
