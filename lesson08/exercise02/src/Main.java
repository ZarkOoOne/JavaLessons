 class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Fotis Zark", "153-264-532-631" , 732.3 , 6);
        b.print();
        System.out.println();

        b.setFullMame("Fotis Zarkadas");
        b.print();
        System.out.println();

        b.setYearsActive(9);
        b.print();
    }
}