package lab5.Zad2;
import Utils.GetInput;

public class Samochod {
    String model, nadwozie, kolor, marka ;
    int  przebieg, rokProdukcji;

    public Samochod(){
        this(GetInput.String("Podaj marke samochodu: "),
                GetInput.String("Podaj model samochodu: "),
                GetInput.String("Podaj nadwozie samochodu: "),
                GetInput.String("Podaj kolor samochodu: "),
                GetInput.Int("Podaj rok produkcji samochodu: "),
                GetInput.Int("Podaj przebieg samochodu: "));
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg < 0 ? (- 1) * przebieg : przebieg;
        this.nadwozie = nadwozie;

    }

}