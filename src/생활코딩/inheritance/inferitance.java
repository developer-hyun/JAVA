package 생활코딩.inheritance;

public class inferitance {
    public static void main(String[] args) {
        Cal c = new Cal(2,1);
        Cal3 c3 = new Cal3(2,1);
    }
}

class Cal {
        int v1,v2;
        Cal(int v1, int v2){
            System.out.println("Cal init");
            this.v1 = v1;
            this.v2 = v2;
        }
}
// 부모에 생성자가 있으면 자식은 부모의 생성자를 써야한다
class Cal3 extends Cal{
    Cal3(int v1,int v2) {
        super(v1,v2); // 부모클래스의 Cal(int v1,intv2)를 의미한다
        System.out.println("Cal3 init");
    }

}



//public class inferitance {
//
//    public static void main(String[] args) {
//        Cal c = new Cal();
//       // System.out.println(c.sum(2,1));
//        System.out.println(c.sum(2,1,1));
////
//        Cal3 c3 = new Cal3();
//        System.out.println(c3.sum(2,1));
////        System.out.println(c3.minus(2,1));
////        System.out.println(c3.sum(2,1));
//
//    }
//}
//
//class Cal{
//    public int sum(int v1, int v2){
//        return v1+v2;
//    }
//    // Overloading
//    public int sum(int v1, int v2, int v3){
//        return this.sum(v1,v2)+v3;
//    }
//}
//
//class Cal3 extends Cal{
//    public int minus(int v1, int v2){
//        return v1-v2;
//    }
//    // Overriding
//    public int sum(int v1, int v2){
//        System.out.println("Cal3!!");
//        return sum(v1,v2);
//    }
//
//}
