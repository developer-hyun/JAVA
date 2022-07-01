//public class DeckTest {
//    public static void main(String[] args) {
////        Deck d = new Deck();
////        System.out.println(d.cardArr[6]);
////        System.out.println(d.cardArr[7]);
////        Deck d = new Deck();
////        Card c = d.pick(0);
////        System.out.println(c);
////
////        d.shuffle();
////        c = d.pick(0);
////        System.out.println(c);
////    Point3D p = new Point3D();
////    p.x = 1;
////    p.y = 2;
////    System.out.println(p.getLocation());
////        child c = new child();
////        c.methid();
//    }
//}
//
//class Point {
//    int x;
//    int y;
//    Point() {}
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    String getLocation() {
//        return x + "," + y;
//    }
//}
//class Point3D extends Point {
//    int z;
//
//    Point3D(int x, int y , int z) {
//        super(x,y);
//        this.z = z;
//    }
//
//    String getLocation() {
//        //return "extends" + x + "," + y;
//        return super.getLocation() + ",";
//    }
//}
//
////class Parent{
////    int x=10;
////}
////class child extends Parent {
////    int x=20;
////    void methid() {
////        System.out.println(x);
////        System.out.println(this.x);
////        System.out.println(super.x);
////    }
////}
//
//
////class Parent {
////    void parentMethod() {}
////}
////
////class child extends Parent {
////    void parentMethod() {}   // 오버라이딩
////    void parentMethod(int i) {}  //오버로딩
////}
//
//
//
//
//
//class Deck{
//    final int CARD_NUM = 52; //카드의 개수
//    Card[] cardArr = new Card[CARD_NUM]; //객체배열
//
//    Deck() {
//        int i =0;
//        for (int k=Card.KIND_MAX; k>0; k--) {
//            for (int j=0; j<Card.NUM_MAX; j++) {
//                cardArr[i++] = new Card(k,j);
//            }
//        }
//    }
//    Card pick(int index) {
//        return cardArr[index];
//    }
//
//    Card pick() {
//        int index = (int)(Math.random() * CARD_NUM);
//        return pick(index);
//    }
//
//    void shuffle() {
//        for (int i=0; i<cardArr.length; i++) {
//            int r = (int)(Math.random() * CARD_NUM);
//            Card temp = cardArr[i];
//            cardArr[i] = cardArr[r];
//            cardArr[r] =temp;
//        }
//    }
//
//
//}

//
//
//class Card {
//    static final int KIND_MAX = 4; //카드 하스다클
//    static final int NUM_MAX = 13; //JQK 포함
//
//    static final int SPADE = 4;
//    static final int DIAMOND = 3;
//    static final int HEART = 2;
//    static final int CLOVER = 1;
//
//    int kind;
//    int number;
//
//    Card() {
//        this(SPADE,1);
//     //   System.out.println("11");
//    }
//
//    Card(int kind,int number) {
//    //    System.out.println("22");
//        this.kind = kind;
//        this.number = number;
//    }
//    public String toString() {
//        String[] kinds = {"","SPADE", "DIAMOND", "HEART", "CLOVER"};
//        String numbers = "0123456789XJQK";
//        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
//        }




