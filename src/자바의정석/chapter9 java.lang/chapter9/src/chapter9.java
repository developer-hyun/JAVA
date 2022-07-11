

public class chapter9 {
    public static void main(String[] args) {
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

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;
        }
        else {
            return false;
        }
    }
    Person(long id) {
        this.id =id;
    }
}


class Value {
    int value;
    Value(int value){
        this.value = value;
    }
}
