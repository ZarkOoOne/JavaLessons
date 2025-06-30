import java.util.Random;

public class exercise04 {
    public static void main(String[] args) {
        int n = 10, sum;
        double average;

        Random r = new Random();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = r.nextInt(1000);
            System.out.print(array[i] + " ");
        }

        sum = 0;
        for (var elem: array){
            sum+=elem;
        }
        average = sum/(double)n;
        System.out.println("\nThe average is: " + average);
    }
}
