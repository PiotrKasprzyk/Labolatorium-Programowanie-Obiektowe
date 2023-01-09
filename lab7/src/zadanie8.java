import Utils.GetInput;

import java.util.*;

class BlednaWartoscSilni extends Exception{
    public BlednaWartoscSilni(String message) {
        super(message);
    }
}

class NieprawidlowyWartosc extends Exception{
    public NieprawidlowyWartosc(String message) {
        super(message);
    }
}

public class zadania08 {
    public static void main(String[] args) {
//        try {
//            int w = GetInput.Int("Podaj n");
//            System.out.println("Silnia z " + n + " wynosi " + silnia(n));
//        } catch (BlednaWartoscSilni e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Podano nieprawidłową wartość");
//        }

//        List<Object> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list.add(2);
//        list.add("3");
//        list.add(4.0);
//        System.out.println(list.get(2));
//        list.add(3, "5");
//        System.out.println(list.get(3));
//        list.set(4, "8");
//        System.out.println(list.get(4));
//        System.out.println("-----------------");
//        Iterator e = list.iterator();
//        while (e.hasNext()){
//            System.out.println(e.next());
//        }
//
//        System.out.println("-----------------");
//
//        for (Object o : list) {
//            System.out.println();
//        }
//
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);

        for (Integer e : set) {
            System.out.println(e);
        }


    }

    public static int silnia(int n) throws BlednaWartoscSilni{
        if (n < 0) throw new BlednaWartoscSilni("Silnia nie istnieje dla liczb ujemnych");
        if (n == 0) return 1;
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }


    class Adres {
    }
}
