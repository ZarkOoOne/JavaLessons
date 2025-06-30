class Main {
    public static void main(String[] args) {
        BankAccount[] array = {
                new BankAccount("Kwsta elem", "153-264-532-631" , 53.2 , 5),
                new BankAccount("Giwrgo pap", "531-613-865-452" , 123.7 , 4),
                new BankAccount("Kristofer spouf", "743-421-647-321" , 732.3 , 7),
                new BankAccount("Ntimitri efet", "358-879-578-042" , 563 , 9),
                new BankAccount("Fotis Zark", "123-456-789-012" , 1425.4 , 2),
        };

        double max = -1;
        BankAccount m = null;
        for (var account: array) {
            if (account.getBalance() > max) {
                max = account.getBalance();
                m = account;
            }
        }

        m.print();

    }
}