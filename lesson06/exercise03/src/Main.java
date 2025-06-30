
public class Main {
    public static void main(String[] args) {
        Philosopher Plato = new Philosopher();
        Plato.fullName = "Plato";
        Plato.era = "Ancient Greek";
        Plato.books[0] = "The Republic";
        Plato.books[1] = "Phaedon";
        Plato.nBooks = 2;
        Plato.school = "Platonism";

        Philosopher BaruchSpinoza = new Philosopher();
        BaruchSpinoza.fullName = "BaruchSpinoza";
        BaruchSpinoza.era = "Modern Netherlands";
        BaruchSpinoza.books[0] = "Ethics";
        BaruchSpinoza.books[1] = "Political Treatise";
        BaruchSpinoza.nBooks = 2;
        BaruchSpinoza.school = "Rationalism";

        Plato.information();
        System.out.println(" ");
        BaruchSpinoza.information();
    }
}