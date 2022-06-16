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

        System.out.println(Card.height);
        Card c1 = new Card();
        c1.kind = "HEART";
        Card c2 = new Card();
        c2.kind = "DIA";
        c1.width = 50;
        System.out.println(c2.width);

    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}



class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

}


