public class nestedLoops3 {
    public static void main(String[] args) {
        final int N=5;

        for (int i=0; i<N; i++) {
            for (int j=0; j< N-i-1; j++)
                System.out.print(" ");
            for (int j=0; j< i+1; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
