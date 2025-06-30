import java.util.Random;

class Main {
    public static void main(String[] args) {
        Point ab = new Point();
        Random r = new Random();

        ab.set(3,4);
        double l = ab.length();
        System.out.println(l);

    }
}