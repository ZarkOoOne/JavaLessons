public class exercise05 {
    public static void main(String[] args) {
        int x = 6;
        String s;

        switch (x) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                s = "Less or equal than 5";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                s = "Greater than 5, less or equal than 10";
                break;
            default:
                s = "invalid value";
        }
        System.out.println(s);
    }
}
