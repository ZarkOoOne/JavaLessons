public class breakWithLabel {
    public static void main(String[] args) {

        outer: for (int i=0; i<=10; i++) {
            for (int j=1; j<=10; j++)
                if (i*j==56) {
                    System.out.println(i + "," + j);
                    break outer;
                }
        }
    }
}
