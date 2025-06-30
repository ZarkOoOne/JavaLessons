import java.util.Random;

public class exercise05 {
    public static void main (String[] args) {
        Random r = new Random();
        int N = 10, M = 4, K = 9;
        int[][][] array = new int[N][M][K];

        for (int i=0; i<N; i++)
            for (int  j=0; j<M; j++)
                for (int k=0; k<K; k++)
                    array[i][j][k] = r.nextInt(5001);

        for (var array2d: array) {
            for (var array1d : array2d) {
                for (var elem : array1d) {
                    System.out.print(elem + " ");
                }
                System.out.println("");
            }
            System.out.println("\n");
        }

        boolean check = false;

        outer: for (var array2d: array)
            for (var array1d : array2d)
                for (var elem : array1d)
                    if ( elem == 1123 ) {
                        System.out.println("i found the element 1123");
                        check = true;
                        break outer;
                    }


            if (check == false)
                System.out.println("Didnt find the element 1123");

    }
}
