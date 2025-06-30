public class exercise07 {
    public static void main(String[] args) {
        int i, j, k;

        for (i=10; i<=20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (j=19; j>=11; j-=2) {
            System.out.print(j + " ");
        }
        System.out.println("");

        for (k=1; k<=29; k++) {
            if (k%3==0 && k%2==1)
            System.out.print(k + " ");
        }
    }
}
