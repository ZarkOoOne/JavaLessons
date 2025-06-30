class Bulldog extends Dog {
    private String ear;

    public Bulldog(int height, int weight, int dB, String ear) {
        super(height, weight, dB);
        this.ear = ear;
    }

    public void sleep(){
        System.out.println("ZzZZZZZZZzZZZzZ");
    }

    public String getEar() {
        return ear;
    }

    public void setEar(String ear) {
        this.ear = ear;
    }
}
