public class chapter7_OOP_II {
    public static void main(String[] args) {

//        FireEngine fe = new FireEngine();
//
//        if (fe instanceof FireEngine) {
//            System.out.println("FireEngine instance");
//        }
//        if ( fe instanceof Car) {
//            System.out.println("Car instance");
//        }
//
//        Car car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//        fe.water();
//        car = fe; // 조상 <- 자손
//        //car.water();
//        fe2 = (FireEngine)car;
//        fe2.water();

//    void method(Object obj) {
//        if (c instanceof Car) {
//
//        }
//    }

//        Tank tank = new Tank();
//        Marin marin = new Marin();
//        SCV scv = new SCV();
//        scv.repair(tank);
        Card c = new Card("HEART",10);
        System.out.println(c.NUMBER);
        System.out.println(c.KIND);

        Card c2 = new Card("DIA",8);
        System.out.println(c2.NUMBER);
        System.out.println(c2.KIND);
    }
}

class Card {
    final int NUMBER;
    final String KIND;
    static int width  = 100;
    static int height = 250;

    Card (String kind, int number) {
        this.KIND = kind;
        this.NUMBER = number;
    }
    Card() {
        this("HEART",1);
        System.out.println("생성자");
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }
}





interface Repairable {}


class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit (int hp){
        this.MAX_HP = hp;
    }
}
class GroundUnit extends Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}
class AirUnit extends Unit {
    AirUnit(int hp) {super(hp);}
}
class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "TANK";
    }
}
class Marin extends GroundUnit{
    Marin() {
        super(40);
        hitPoint = MAX_HP;
    }
}
class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit)r;
            while (u.hitPoint != MAX_HP) {
                u.hitPoint++;
            }
        }
    }
}






//abstract class Player {
//    int current;
//    Player() {            //추상클래스도 생성자가 있어야함
//        current = 0;
//    }
//    abstract void play(int pos);
//    void play() {         //추상메서드를 사용할 수 있다.
//        play(current);
//    }
//}
////
////interface test {
////    public static final int score = 10;
////    public abstract void test2(int pos);
////
////    final int DIAMOND=3;
////    static int HEART=2;
////    int CLOVER=1;
////}
////
////interface Movable{
////    void move(int pos);
////}
////interface Attack {
////    void attack(int pos);
////}
////class Fighter implements Fightable{
////    public void move() {}  //조상 인터페이스가 public이 숨어있음으로 자손은 조상보다 넓어야하므로 public써야함
////}
////interface Fightable {
////    void move(int x,int y);
////}
//
////
//class Product {
//    int price;
//    int bonusPoint;
//}
//class Tv extends Product { }
//class Computer extends Product {}
//class Audio extends Product {}
//
//class Buyer {
//    int money = 1000;
//    int bonusPoint =0;
//}
//
//
//class Car {
//    String color;
//    int door;
//
//    void drive() {
//        System.out.println("Drive");
//    }
//    void stop() {
//        System.out.println("Stop");
//    }
//}
//class FireEngine extends Car {
//    void water() {
//        System.out.println("water");
//    }
//}
//class Ambulance extends Car {
//    void siren() {
//        System.out.println("srien");
//    }
//}