public class exercise07 {
    public static void main(String[] args) {
        int hour = 8;
        int minute = 5;
        int second = 1;

        if (!(hour>=0 && hour<=23))
            System.out.println("invalid hour");
        else if (!(minute>=0 && minute<=59))
            System.out.println("invalid minute");
        else if (!(second>=0 && second<59))
            System.out.println("invalid second");
        else {
            if (hour>=0 && hour<=9)
                System.out.print("0");
            System.out.print(hour + ":");

            if (minute>=0 && minute<=9)
                System.out.print("0");
            System.out.print(minute + ":");

            if (second>=0 && second<=9)
                System.out.print("0");
            System.out.print(second);
        }
    }
}
