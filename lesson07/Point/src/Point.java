class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point (int diag){
        x = diag;
        y = diag;
    }

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    void set(int x , int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}
