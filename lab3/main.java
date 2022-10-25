public class main {
    public static void main (String[] args){
        definicja();
    }
    public static void definicja(){
        double [] data;
        data=mew double[30];
        double data1=new double[30];
        String[]slowa;
        slowa= new string[]{"ala","ma","kota"}
                int[] intliczba={1,2,3,4,56,7,87,546,23}
                        int[] tab1 =new tab1[10];
        tab[0]=1;
        tab[1]=2;
        string test="witaj";
        System.out.printf("element"+intliczba[1]);
        System.out.printf(slowa[0]+slowa[1]+slowa[2]);
        System.out.printf("liczba elementów w tablicy"+intliczby.length);
        System.out.printf("liczba elementó w tablicy slowa"+slowa.length);
        System.out.printf("liczba znaków"+test.length());
        for (int i = 0; i <intliczby ; i++) {
            System.out.printf(intliczba[i]+",");
        }
        for (int i:intliczba) {
            System.out.printf(i+",");
        }
        int[][]tabA=new int[3][4];
        int[][][]macierz3d={
                {1,32,1},
                {213,23,1327}},
                {{3213,21,32,3,213,},
                {12,32,31,}},
                {{13,3123,213,123},
                {123,123.123},
        };
        int[][]a={
                {1,23,4},
                {21,3,21,3,12,32,3,123,12,12},
                {2},
        }
        System.out.println("elementy tablicy a:");
        for (int i = 0; i < a[i].length; i++) {
            for (int j = 0; j < ; j++) {
                System.out.printf(a[i][j]+"\t");
            }


        }
        for (int []innerArrayA:a) {
            for (int data:innerArrayA) {
                System.out.printf(data+"\t");
            }

        }
        for (int[][] array2d:macierz3d
             ) {
            for (int[]array1d:array2d
                 ) {
                for (int item:array1d
                     ) {
                    System.out.printf(item+"\n");
                }

            }

        }
        int[]tab1={1,2,34,5,6};
        int[]tab2=new int[4];
        System.arraycopy(tab1,srcPos:0,tab2,desPos:4,lenght:4);
        System.out.printf("tab 2 po skopiowaniu:"+arrays.toString(tab2));


    }
public static void Zadanie1(){
        double[]array=new double[10];
        double suma=0,srednia;
    for (int i = 0; i < array.lenght; i++) {
        array[i]=losuj();
        suma+=array[i];
        System.out.printf(array[i]+"\t");
    }
    System.out.printf("Suma:"+suma+",srednia"=suma/array.lenght);
    for (double data:array
         ) {
        System.out.printf(array+"\t");
        suma+=data;
    }
    System.out.printf("Suma:"+suma+",srednia"=suma/array.lenght);

}
public static double losuj(){
        random.rand=new Random();
        double liczba=rand.nextDouble(bound:26)-10;
            return liczba;
}
public static void Zadanie2(){
        double []tab1=newDouble[20];
    double []tab2=newDouble[21];

    for (int i = 0; i < tab1[].length; i+2) {
        System.out.printf(tab1[i]+"\n");
        System.out.printf(tab2[i]+"\n");
    }
}
public static void Zadanie 3(){
        string[]wyrazy=newString[22];
        wyrazy[]={"ala","tygrys","zjadł"};
        for (string data:wyrazy
             ) {
            String.toUppercase(data);
            System.out.printf(data+"\n");
        }
    }
    public static void Zadanie4(){

    }
}
