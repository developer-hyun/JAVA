package 생활코딩.oop;

//객체지향프로그래밍
public class oop1 {
    public static void main(String args[]) {
        //System.out.println(Foo.classVar); //OK
       // System.out.println(Foo.instanceVar); // X
//        Foo f1 = new Foo();
//        Foo f2 = new Foo();

        //System.out.println(f1.classVar);
       // System.out.println(f1.instanceVar);

//        f1.classVar = "changed by f1";
//        System.out.println(Foo.classVar);
//        System.out.println(f2.classVar);
//
//        f1.instanceVar = "changed by f1-1";
//        System.out.println(f1.instanceVar);
//        System.out.println(f2.instanceVar);

        //생성자(constr this
//        Print p1 = new Print("AAAA");
//        p1.A();


        //클래스와 인스턴스 활용
//        Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());

//        Accounting a1 = new Accounting(1000.0);
//        Accounting a2 = new Accounting(2000.0);
//        System.out.println(a1.valueOfSupply);
//        System.out.println(a2.valueOfSupply);

    }
}
class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1;
    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT(){
        double valueOfSupply = 20000.0;
        return this.valueOfSupply * vatRate;
    }
    public double getTotal() {
        return this.valueOfSupply * vatRate;
    }
}

//class Accounting{
//    public static double valueOfSupply;
//    public static double vatRate = 0.1;
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    }
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }
//}

//this
class Print {
    public String delimiter="";
    public Print(String delimiter){
        this.delimiter = delimiter;
    }
    public void A(){
        System.out.println(this.delimiter);
    }
}
//생성자
//class Print {
//    public String delimiter="";
//    public Print(String _delimiter){
//        delimiter = _delimiter;
//    }
//    public void A(){
//        System.out.println(delimiter);
//    }
//}

class Foo{
    public static String classVar = "classVar";
    public String instanceVar = "instanceVar";

    public static void classMethod(){  //static은 클래스에속해있음음
       System.out.println(classVar);  //OK
        //System.out.println(instanceVar); //X
    }
    public void instanceMethod(){
        System.out.println(classVar); //OK
        System.out.println(instanceVar); //OK
    }

}
//public class oop1 {
//    public  static String delimiter="";
//    public static void main(String args[]) {
//
//        //main 함수안에 delimiter가 없으므로 oop1클래스에서  delimiter를 찾음
//        delimiter = "AA";
//        printA();
//        printB();
//
//        delimiter = "BB";
//        printB();
//        printA();
//
//    }
//
//    public static void printA(){
//        System.out.println(delimiter);
//    }
//    public static void printB(){
//        System.out.println(delimiter);
//    }
//}
