public class arrays {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4};
        int[] myarray = new int[5];
        for (int i=0; i<5; i++)
            myarray[i]=i*i;
        for (int i=0; i<5; i++)
            System.out.println(myarray[i]);
    }
}
