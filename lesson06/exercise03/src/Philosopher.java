class Philosopher {
    String fullName;
    String era;
    String[] books;
    int nBooks;
    String school;

    Philosopher() {
         books = new String[5];
         nBooks = 0;
    }

    void information() {
        System.out.println("Fullname: " + fullName);
        System.out.println("Era: " + era);
        System.out.print("Books " + nBooks);
        for (var item: books)
            System.out.print(item + " ");
        System.out.println("");
        System.out.println("School " + school);
    }

}
