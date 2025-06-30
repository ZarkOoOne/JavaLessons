public class exercise06 {
    public static void main(String[] args) {
        int x = 6;
        String s;

        if (x >= 0 && x <= 5)
            s = "Less or Equal than 5";
        else if (x > 0 && x <= 10)
            s = "Greater than 5, Less or Equal than 10";
        else
            s = "invalid value";

        System.out.println(s);
    }
}
