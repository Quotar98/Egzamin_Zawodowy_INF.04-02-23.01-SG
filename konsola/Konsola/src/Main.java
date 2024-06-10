public class Main {
    public static void main(String[] args) {
        Notatka notatka1 = new Notatka("Egzamin 1", "Egzamin 1 godz. 8:00");
        Notatka notatka2 = new Notatka("Egzamin 2", "Egzamin 2 godz. 17:00");
        Notatka notatka3 = new Notatka("Egzamin 3", "Egzamin 3 godz. 8:00");
        notatka1.wyswietl();
        notatka1.diagnostyka();

        notatka2.wyswietl();
        notatka2.diagnostyka();

        notatka3.wyswietl();
        notatka3.diagnostyka();
    }
}