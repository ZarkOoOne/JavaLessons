import java.util.Random;

class Main {
    public static void main(String[] args) {
        Point ab = new Point();
        Random r = new Random();
        ab.print();

        ab.set(r.nextInt(11),r.nextInt(11));
        ab.print();

        ab.x = 10+r.nextInt(11);
        ab.y = 10+r.nextInt(11);
        ab.print();

    }
}