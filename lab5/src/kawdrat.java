public class Kwadrat extends Prostokat {
    public Kwadrat(double bok, String kolor)
    {
        super(bok, bok, kolor);
    }
    public Kwadrat(double bok)
    {
        super(bok, bok);
    }

    public double getBok()
    {
        return szerokosc;
    }
    public void setBok(double bok)
    {
        this.szerokosc = bok;
        this.wysokosc = bok;
    }

    @Override
    public String opis() {
        return "Kwadrat{" +
                "wys=" + wysokosc +
                ", szer=" + szerekosc +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}