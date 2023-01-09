
public class Main {
    public static void main(String[] args) {
        Statek statek = new Statek();
        statek.plyn();


        Samolot samolot = new Samolot();
        samolot.lec();
        Wieloryb wieloryb = new Wieloryb();

        wieloryb.wynurz();
        wieloryb.zanurz();
        wieloryb.plyn();


        wieloryb.lec();
        wieloryb.wyladuj();

        wieloryb.wydalaj();
        wieloryb.jedz();

        Punkt p1 = new Punkt(5,7);


        Figura[] tablicaFigur = new Figura[10];


        tablicaFigur[0] = new Kwadrat(5,"różowy");
        tablicaFigur[1] = new Prostokat(6,4,"biały");
        tablicaFigur[2] = new Trojkat(2,4,"niebieski");
        tablicaFigur[3] = new Trojkat(7,6,"turkusowy");
        tablicaFigur[4] = new Kwadrat(5,"czerwony");
        tablicaFigur[5] = new Prostokat(8,9,"biały");
        tablicaFigur[6] = new Prostokat(1,1,"fioletowy");
        tablicaFigur[7] = new Trojkat(3,3,"szary");
        tablicaFigur[8] = new Kwadrat(7,"brązowy");
        tablicaFigur[9] = new Kwadrat(9,"czarny");


        for(int i=0;i<tablicaFigur.length;i++)
        {
            System.out.println(tablicaFigur[i].opis());
        }
    }

}