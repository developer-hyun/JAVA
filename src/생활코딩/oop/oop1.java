package 생활코딩.oop;

//객체지향프로그래밍
public class oop1 {
    public  static String delimiter="";
    public static void main(String args[]) {

        //main 함수안에 delimiter가 없으므로 oop1클래스에서  delimiter를 찾음
        delimiter = "AA";
        printA();
        printB();

        delimiter = "BB";
        printB();
        printA();

    }

    public static void printA(){
        System.out.println(delimiter);
    }
    public static void printB(){
        System.out.println(delimiter);
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
