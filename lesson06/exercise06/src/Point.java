import java.lang.Math;

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    void set(int x , int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    double length() {
        double len = Math.sqrt(x*x + y*y);
        return len;
    }
}
