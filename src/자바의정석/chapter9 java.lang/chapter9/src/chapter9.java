import java.util.Arrays;

public class chapter9 {

    public static void main(String[] args) throws Exception{

        example c1 = new example();
        example c2 = example.class.newInstance();  //클래스 객체를 통해서도 인스턴스 생성가능
        Class cl = c1.getClass();
        System.out.println(c1.x);

        String str1 = "abc";
        String str2 = new String("abc");
        StringBuffer sb = new StringBuffer("abc");
        sb.append("123");
        System.out.println(sb);
    }
}

class example {
    int x = 1;
    int y = 2;
}



//        int[] arr = {1,2,3};
//        int[] arr2 = arr.clone();
//        arr[1] = 4;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//    example p1 = new example(3,5);
//    example p2 = (example)p1.clone();  //Object클래스와 example클래스이기 때문에 형변환 필요
//    int [] arr = {1,2,3};
//    arrTest t1 = new arrTest(arr,new example(7,8));
//    arrTest t2 = t1.shallowCopy();
//    arrTest t3 = t1.deepCopy();
//    t2.e.x=10;
//    t2.x[1] = 10;
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//    }
//}
//class arrTest  implements  Cloneable{
//    int[] x;
//    example e;
//    arrTest(int[] x,example e) {
//        this.x = x;
//        this.e = e;
//    }
//    public String toString() {
//        return Arrays.toString(x) + e;
//    }
//    public arrTest shallowCopy() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e){}
//        return (arrTest) obj;
//    }
//    public arrTest deepCopy() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e){}
//        arrTest at = (arrTest) obj; //새롭게 인스턴스를 하나 생성
//        at.e = new example(this.e.x,this.e.y); //생성한 객체의 값을 지정
//        return at;
//    }
//}
//class example implements Cloneable { //clonealbe이 있어야지만 clone을 쓸수있다. 없으면 예외가 발생
//    int x ,y;
//    example(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//    public String toString() {
//        return " "+ x + " " + y;
//    }
////    protected Object clone() {
////        Object obj = null;
////        try {
////            obj = super.clone(); //Object에 있는 클론  클론은 예외처리 필수
////        } catch (CloneNotSupportedException e) {}
////        return obj;
////    }
//    public example clone() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e){}
//        return (example)obj;
//    }
//
//     }



        //        int[] arr = {1,2,3};
//        int num = 1;
//        System.out.println(arr.toString());
//
//        Card c1 = new Card();
//        System.out.println(c1.toString());

//class Card {
//    int number =2;
//
//    public String toString() {
//        return "number = " + number;
//    }
//
//}
        //        Value v1 = new Value(10);
//        Value v2 = new Value(20);
//        System.out.println("test");
//
//
//        if (v1.equals(v2)) {
//            System.out.println("같음");
//        }
//        else {
//            System.out.println("다름");
//        }
//
//        v2 = v1;
//        if (v1.equals(v2)) {
//            System.out.println("두번째 같음");
//        }
//        else {
//            System.out.println("두번째 다름");
//        }


//        Person p1 = new Person(8011);
//        Person p2 = new Person(8011);
//
//        if (p1==p2) {
//            System.out.println("같음");
//        }
//        else {
//            System.out.println("다름");
//        }
//        if (p1.equals(p2)) {
//            System.out.println("두번째 같음");
//        }

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(System.identityHashCode(str1));
//        System.out.println(System.identityHashCode(str2));
//    }
//}
//
//class Person {
//    long id;
//
//    public boolean equals(Object obj) {
//        if (obj instanceof Person) {
//            return id == ((Person)obj).id;
//        }
//        else {
//            return false;
//        }
//    }
//    Person(long id) {
//        this.id =id;
//    }
//}
//
//
//class Value {
//    int value;
//    Value(int value){
//        this.value = value;
//    }
//}
