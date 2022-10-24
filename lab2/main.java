public class main {
    public static void main(string[] args) {
Zadanie5();
           Scanner odczyt = new Scanner(System.in);

        string pada = odczyt.nextString();
		string autobus = odczyt.nextString();
		string znizka = odczyt.nextString();
		string podwyzka = odczyt.nextString();
		int x = odczyt.nextInt();
		int y = odczyt.nextInt();
		int z = odczyt.nextInt();
        System.out.println(pada);
  		System.out.println(autobus);
        System.out.println(znizka);
  		System.out.println(podwyzka);
 		System.out.println(x);
  		System.out.println(y);
        System.out.println(z);
        System.out.println("Palindrom"+a+"czy palindrom");
        System.out.println("Palindrom"+b+"czy palindrom");
        System.out.println("Palindrom"+c+"czy palindrom");

    }


}
public static double input(){
    Scanner input = new Scanner(System.in);
            System.out.println("Podaj n:");
                    double n= input.nextDouble();
return n;}
public static void Zadanie1(){
    double ilStud = input();
    double pkt, suma=0;
    int a=0,b=40,ile=0;
    if(ilStud>0){
        while(ilStud>0){
            System.out.println("Podaj lp. pkt 0-40");
            pkt=input();
            if(pkt>=a && pkt<=b){
                suma+=pkt;
                ile++;
                ilStud--;
            }
        }
        System.out.println("Suma pkt="+ile)
        System.out.println("Suma pkt="+suma)
        System.out.println("Suma pkt="+suma/ile)
    }else Stystem.out.println("Grupa musi liczyc co najmniej jednego studenta")
    }
public static void zadanie2{
    double sumad=0,sumau=0,iledot=0,ileu=0,liczba;
        for (int i = 0; i < 10; i++) {
            liczba=Input;

            if(liczba>0)
            {
                sumad+=liczba;
                        iledot++;
            }else{ileu++;sumau+=liczba

        }
    } System.out.println();

}
public static void Zadanie3() {
        double n = Input();
        double liczba, suma = 0
        if (n > 0) {
            while (n > 0) {

                liczba = Input();
                if (liczba % 2 == 0) suma += liczba;
                n--;
            } else System.out.println("ciąg musi miec conajmniej jedna liczba ");
        }
        }

    public static void Zadanie4() {
        double n = Input();
        int liczba, suma = 0;
        Random rand = new Random();
        if (n > 0) {
            while (n > 0){

        liczba=rand.nextInt(bound=56)-10;

        if(liczba%2==0)suma+=liczba;
        n--;
        }
            System.out.println("Suma liczb parzystych: "+suma);
            } else System.out.println("ciąg musi miec conajmniej jedna liczba ");
        }

        public static boolean zadanie5 (String text){
int end =text.length()-1;
text.toLowerCase(Locale.ROOT);
for(int i=0;i<text.length()/2;i++)
        {
            if(text.charAt(i)!=text.charAt(end))
        {
       return false;
       end--;
        }
return true;
}
  //zadanie 1 z lab02
  public static void zd1(){
    double a = Input();
        double b = Input();
        double c = Input();
        double x,d,x1,x2;
        d=(b*b)-(4*a*c);
        if(d>0)
        {
            x1=(-b+Math.sqrt(d))/(2*a);
        x2=(-b-Math.sqrt(d))/(2*a);

        }

        }
public static double zadanie 2(){
double x,y,z;
if(x>0)
{
 System.out.println("a(x)="+(x*2));
}
if(x==0){
 System.out.println("a(x)="+"0");
}
if(x<0){
 System.out.println("a(x)="+(x*(-3)));
}
if(y>=1){
 System.out.println("b(y=)"+(y*y));
}
if(y<1)
{
 System.out.println("b(y)="+y);
}
if(z>2)
{
 System.out.println("c(z)="+(z+2));
}
if(z==2 )
{
 System.out.println("c(z)="+"8");
}
if(z<2)
{
 System.out.println("c(z)"+(z-4));
}

}
public static double zadanie 3(){
double x=3,y=1.5,z=1,tab[x,y,z];
array.sort(tab);

}
public static string zadanie 4() {
string pada,autobus;
if(pada&&autobus){
System.out.println("Weź parasol"+"Dostaniesz się na uczelnie");
}
if(pada && (!autobus))
{System.out.println("Nie dostaniesz się na uczelnie")}
if((!pada)&&autobus){
System.out.println("Dostaniesz się na uczelnie"+"Miłego dnia i pięknej pogody");
}
}
public static string zadanie 5 (){
string znizka,podwyzka;
if((!znizka)||podwyzka){
System.out.println("Możesz kupić samochód!"+"Zniżki na samochód nie ma");
}
}

if((!znizka)||(!podwyzka)){
System.out.println("Zakup samochodu trzeba odłozyć na później.."+"Zniżki na samochód nie ma");
}
}
if(znizka||podwyzka){
}
System.out.println("Możesz kupić samochód!");
}
}
public static double zadanie6(){
double a,b,c
int kaukulator = 4
switch(kaukulator)
case dodawanie:
a+b=c;
System.out.println("Wynik="+c);
break;
case odejmowanie:
a-b=c;
System.out.println("Wynik="+c);
break;
case dzielenie:
a/b=c;
System.out.println("Wynik="+c);
break;
case mnozenie:
a*b=c;
System.out.println("Wynik="+c);
break;
}
}
