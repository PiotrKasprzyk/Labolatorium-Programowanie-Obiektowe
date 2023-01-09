
class Trojkat extends Figura implements Figury1{
    int wysokosc=0;
    int podstawa=0;
    Trojkat(int wysokosc,int podstawa,String kolor){

        this.wysokosc = wysokosc;
        this.podstawa = podstawa;
        super.kolor = kolor;
    }
    public String opis(){
        return "Trojkat o wymiarach: "+wysokosc+"  "+podstawa;
    }

    public void skaluj(int skala){
        wysokosc = wysokosc*skala;
        podstawa = podstawa*skala;
    }

    @Override
    public float getPowierzchnia() {
        return 0;
    }

    @Override
    public boolean wPolu(Punkt k) {
        return false;
    }
}
