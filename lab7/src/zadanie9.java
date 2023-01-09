import java.util.ArrayList;
import java.util.LinkedList;

public class zadania9 {
    public static void main(String[] args) {

        ArrayList<Uczestnik> uczestnicy = new ArrayList<>();

        uczestnicy.add(new Uczestnik("Piotr", 21));
        uczestnicy.add(new Uczestnik("Wiktor", 15));
        uczestnicy.add(new Uczestnik("Wojciech", 20));
        uczestnicy.add(new Uczestnik("Julia", 29));
        uczestnicy.add(new Uczestnik("Marek", 18));

        ArrayList<Uczestnik> filtered = filterUnderage(uczestnicy);

        for (Uczestnik u : filtered) {
            System.out.println(u.toString());
        }

        LinkedList<Uczestnik> uczestnicyLinked = new LinkedList<>();

        uczestnicyLinked.add(new Uczestnik("Piotr", 21));
        uczestnicyLinked.add(new Uczestnik("Wiktor", 15));
        uczestnicyLinked.add(new Uczestnik("Wojciech", 20));
        uczestnicyLinked.add(new Uczestnik("Julia", 29));
        uczestnicyLinked.add(new Uczestnik("Marek", 18));

        LinkedList<Uczestnik> filteredLinked = filterUnderage(uczestnicyLinked);

        for (Uczestnik u : filteredLinked) {
            System.out.println(u.toString());
        }
    }

    public static ArrayList<Uczestnik> filterUnderage(ArrayList<Uczestnik> uczestnicy){
        ArrayList<Uczestnik> filtered = new ArrayList<>();
        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() >= 15){
                filtered.add(uczestnik);
            }
        }
        return filtered;
    }

    public static LinkedList<Uczestnik> filterUnderage(LinkedList<Uczestnik> uczestnicy){
        LinkedList<Uczestnik> filtered = new LinkedList<>();
        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() >= 15){
                filtered.add(uczestnik);
            }
        }
        return filtered;
    }

    public static class Uczestnik {
        private String imie;
        private int wiek;

        public Uczestnik(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }

        public String getImie() {
            return imie;
        }

        public int getWiek() {
            return wiek;
        }

        public String toString() {
            return "Uczestnik{" +
                    ", imie='" + imie + '\'' +
                    ", wiek=" + wiek +
                    '}';
        }

        public boolean equals(Uczestnik uczestnik) {
            if (this == uczestnik) return true;
            if (uczestnik == null || getClass() != uczestnik.getClass()) return false;

            Uczestnik uczestnik1 = (Uczestnik) uczestnik;

            if (wiek != uczestnik1.wiek) return false;
            return imie != null ? imie.equals(uczestnik1.imie) : uczestnik1.imie == null;
        }

        public int hashCode() {
            int result = 30 + (imie != null ? imie.hashCode() : 0);
            result = 30 * result + wiek;
            return result;
        }
    }
}
