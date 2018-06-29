import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        boolean i = true;
        boolean g = false;
        float x = 10.83f;
        int a = (int) 10.19;
        int с = 7 % 4;
        // System.out.println(c);

        int ih = 0;
        ih++;
        // System.out.println(ih);
        ih--;
        //System.out.println(ih);
        ih = 5;
        ++ih;
        //System.out.println(ih);
        --ih; //сначала изменяется переменная, потом над ней происходит действие
        // System.out.println(Math.sqrt(9));

        boolean qw = true;
        boolean yu = false;
        boolean tr = qw & yu;
        //System.out.println(tr);

        int gh = 9;
        int hu = 0;
        //System.out.println(gh>hu);

        int u = 9;
        u += 5;
        //System.out.println(u);
        boolean q = true;

//        if (q){
//            System.out.println("test");
//        }
//
//        if(!g){
//            System.out.println("test");
//        } else if (qw){
//            System.out.println("test2");
//        }
//
//        int io = 6;
//        switch (io) {
//            case 5:
//                System.out.println("i am 5");
//                break;
//            case 6:
//                System.out.println("i am 6");
//                break;
//            default: // выполняется, если не выполнено не одно из условий
//                System.out.println("i am default");
//        }

        int[] arrayInt = {1, 2, 10, 4, 5}; //одинарный массив
//        System.out.println(arrayInt[0]);
//        System.out.println(arrayInt[4]);

        int[] arrayInt2 = new int[5];
        arrayInt[4] = 10;
//        System.out.println(arrayInt2[0]);
//        System.out.println(arrayInt2[4]);

//        int arrayInt3 [][] = new int [2][3]; //двумерный
//        System.out.println(arrayInt3.length); // длина массива
//        System.out.println(arrayInt.length);
//        System.out.println(arrayInt3.length * arrayInt3[1].length);

//        int kli = 5;
//        while (kli != 0) {
//            System.out.println("Hello World");
//            kli--; //точка выхода
//        }

//        int klin = 5;
//        while (klin <= 10) {
//            System.out.println("Hello World");
//            if (klin==11){
//                break; //брывает цикл
//            }
//            klin++;

//        int [] arrayInt4 = {1,2,3,4,5};
////        int j = 5;
//        for (int p = 0; p <= arrayInt4.length-1; p++) { // не выходить за пределы массива (length-1)
//            System.out.println(arrayInt4[p]);
//
//        }

//        int [] arrayInt5 = {1,2,3,4,5};
//        for (int e: arrayInt5
//                ){
//            System.out.println(e);
//        }
//
//
//        int asd = 3;
//        do {
//            System.out.println("");
//        } while (asd==2); //условие

        String ss = "Hello World";

        System.out.println(ss.equals("Hello World"));

        String ssl = ss + "!!!";
        String ssl2 = ssl.concat(">>>>>");
        System.out.println(ssl2);





    }
}
