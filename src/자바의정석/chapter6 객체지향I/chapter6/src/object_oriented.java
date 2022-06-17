import javax.xml.crypto.Data;

public class object_oriented {
    public static void main(String args[]) {
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

        Data1 d = new Data1();
        d.x=10;

        Data1 d2 = copy(d);
        System.out.println(d.x);
        System.out.println(d2.x);
    }
    static Data1 copy (Data1 d) {
        Data1 tmp = new Data1();
        tmp.x = d.x;
        return tmp;
    }
}

class Data1 {int x;}





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



