class Prostokat extends Figura implements IFigury {
    int wysoksc=0;
    int szerokosc=0;

    Prostokat(int wysokosc,int szerokosc,String kolor){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        super.kolor = kolor;
    }
    public String opis(){
        return "Prostokat o wymiarach: "+szerokosc+" x "+wysokosc;
    }

    public void skaluj(int skala){
        wysokosc = wysokosc*skala;
        szerokosc = szerokosc*skala;
    }

    @Override
    public float getPowierzchnia() {
        return wysokosc*szerokosc;
    }

    @Override
    public boolean wPolu(Punkt k) {
        return false;
    }
}