abstract class Figura{


    Punkt punkt;
    String kolor = "czarny";

    abstract String opis();
    abstract void skaluj(int skala);
    Figura(){
        punkt = new Punkt(0,0);
    }
    Figura(String kolor){
        this.kolor=kolor;
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    String getKolor(){
        return kolor;
    }

}