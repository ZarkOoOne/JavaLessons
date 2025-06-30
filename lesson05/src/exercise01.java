public class exercise01 {
    public static void main(String[] args) {
        int[] array = {0,23,53,12,66,74,23,15,4,31};
        int seat = 0;

        for (int i=0; i<10; i++) {
            if (array[i] == 12) {
                seat = 1;
                System.out.println("There is a 12 in seat: " + i);
            }
        }
        if (seat == 0)
            System.out.println("There is no 12 in this array");
    }
}
