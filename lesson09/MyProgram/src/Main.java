public class Main {
    public static void main(String[] args) {
        if (args.length==0)
            System.out.println("Wrong input!");
        else if (args.length==1)
            if (args[0].equals("-h"))
                System.out.println("This is the Help Section!");
            else
                System.out.println("Wrong Input!");
        else if (args.length==2)
            if(args[0].equals("-P"))
                System.out.println("Running with parameter " + args[1]);
            else
                System.out.println("Wrong input!");
        else
            System.out.println("Wrong input!");
    }
}