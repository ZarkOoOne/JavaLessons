class Cycle {
    private double c;
    private String metric;
    static final double pi = 3.1415;

    Cycle(double c, String metric){
        this.c = c;
        this.metric = metric;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    static double inToCm(double in){
        return in*2.54;
    }

    static double cmToIn(double cm){
        return cm/2.54;
    }

    double perimeterCm(){
        if (metric.equals("cm"))
            return 2*pi*c;
        else
            return 2*pi*inToCm(c);
    }

    double perimeterIn(){
        if (metric.equals("in"))
            return 2*pi*c;
        else
            return 2*pi*cmToIn(c);
    }
}
