
import Chapter6_data.*;

import java.util.Date;


public class object_oriented {


    public static void main(String args[]) {
    }
        void instanceMethod(){}
        static void staticMethod(){}
        void instanceMethod2() {
            instanceMethod();
            staticMethod();
        }
        static void staticMethod2(){
           // instanceMethod();  //에러
            staticMethod();

        }
    }

//        Tv[] tvArr = new Tv[3];
//
//        for (int i=0;i<tvArr.length;i++){
//            tvArr[i] = new Tv();
//            tvArr[i].channel = i+10;
//        }
//        System.out.println(tvArr[2].channel);
//    }

//        System.out.println(Card.height);
//        Card c1 = new Card();
//        c1.kind = "HEART";
//        Card c2 = new Card();
//        c2.kind = "DIA";
//        c1.width = 50;
//        System.out.println(c2.width);

//    firstMethod();
//
//    }
//    static void firstMethod() {
//        secondMethod();
//    }
//    static void secondMethod() {
//        System.out.println("second");
//    }
//        Data1 d = new Data1();
//        d.x = 10;
//        System.out.println("main" + d.x);
//
//        change(d.x);
//        System.out.println("after change");
//        System.out.println("main" +d.x);
//
//    }
//    static void change(int x){
//        x=1000;
//        System.out.println("change" + x);
//    }
////}
//        Data1 d = new Data1();
//        d.x = 10;
//        System.out.println("main" + d.x);
//
//        change(d);
//        System.out.println("after change");
//        System.out.println("main" +d.x);
//
//    }
//    static void change(Data1 d){
//        d.x=1000;
//        System.out.println("change" + d.x);
//    }
//}
//
//    class Data1 {
//        int x;
//    }

//        object_oriented r = new object_oriented();
//        int[] result1 = new int[1];
//       // System.out.println(result1.length);
//        r.add(3,5,result1);
//        System.out.println(result1[0]);
//    }
//        void add ( int a, int b, int[] result){
//            result[0] = a + b;
//        }
//    }

//        Data1 d = new Data1();
//        d.x=10;
//
//        Data1 d2 = copy(d);
//        System.out.println(d.x);
//        System.out.println(d2.x);
//    }
//
//
//    static Data1 copy (Data1 d) {
//        Data1 tmp = new Data1();
//        tmp.x = d.x;
//        return tmp;
//    }
//    int n = factorial(4);
//        System.out.println(n);
//
//    }
//    static int factorial(int n) {
//        if (n==1) return 1;
//        return n * factorial(n-1);
//    }
//        int x = 2;
//        int n = 5;
//        long result = 0;
//        for (int i=1;i<=n;i++){
//            result +=power(x,i);
//        }
//        System.out.println(result);
//        Data d1 = new Data();
//        d1.Data_Function();
//        }
//    static long power(int x , int n) {
//        if (n==1) return x;
//        return x*power(x,n-1);
//    }
//    rename d1 =new rename();
//    d1.data1 = 1;
//    System.out.println(d1.data1);
//
////    rename d2 = new rename();
////    d2.data1 = 2;
////    System.out.println(d2.data1);
////    System.out.println(d1.data1);
//
//        change(d1);
//        System.out.println(d1.data1);
//    }
//    static void change(rename d) {
//        d.data1=1000;
//        System.out.println(d.data1);
//
//    }
//        System.out.println(MyMath2.add(200L,100L));
//        MyMath2.a=1000L;
//        System.out.println(MyMath2.a);
//        MyMath2 mm = new MyMath2();
//        mm.b = 300L;
//        System.out.println(mm.add());
//        Data1 d = new Data1();
//        d.x = 10;
//        System.out.println("main" + d.x);
//
//        change(d);
//        System.out.println("after change");
//        System.out.println("main" +d.x);
//
//        Data1 d2 = new Data1();
//        System.out.println(d2.x);
//    }
//    static void change(Data1 d){
//        d.x=1000;
//        System.out.println("change" + d.x);
//    }
//}
//
//class Data1 {
//    int x;
//}

//class Data1 {int x;}





//
//
//    class Card {
//        String kind;
//        int number;
//        static int width = 100;
//        static int height = 250;
//    }
//
//
//    class Tv {
//        String color;
//        boolean power;
//        int channel;
//
//        void power() {
//            power = !power;
//        }
//
//        void channelUp() {
//            ++channel;
//        }
//
//        void channelDown() {
//            --channel;
//        }
//
//    }



