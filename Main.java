import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.print("witam");

        System.out.print("witaj print");
        System.out.printf("witam print");
        int b = 20;
        String imie ="Piotr";
        boolean wartosc = true;
        System.out.println("imie:"+imie+"wartosc b="+b);
    Scanner input = new Scanner(System.in);
    b= input.nextInt();
    int c=3;
    c++;c--;++c;
    c+=c;
    //zadanie 1

        System.out.println(getName());
        System.out.println(getAge());
    }
    public static  String getName(){
        return Piotr;
    }
    public static  int getAge(){
        return 20;
    }
    //zadanie 2
    public static void obliczenia(int a,int b){

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));



    }
    Scanner in= new Scanner(System.in);
        System.out.println("Podaj a =");
        int a =in.nextInt();
      System.out.println("Podaj b =");
    int b =in.nextInt();
//zadanie 3
    public static boolean liczbaParzysta(int f){
        f=9;
        if(f%2==0)
        {
            return true ;
        }
else
        {
            return false;
        }
    }
    //zadanie 4
    public static boolean podzielnosc(int h)
    {
        h=9;
        if(h%5==0&&h%3==0)
        {
            return true;

        }
        else return false;
    }
    //zadanie 5
    public static int potega(int k){
        k=8;
        return (int) Math.pow(k,3);
    }
    //zadanie 6
    public static int pierwiastek(int n)
    {
        n = 9;
        return (int) Math.sqrt(n);
    }
    //zadanie 7
    public static int budowatrojkota(){
random rand = new Random ();
int  a=7,b=15;
int losowa = rand.nextInt(bound:b-a+1)+a;
System.out.println(losowa);


    }
}


