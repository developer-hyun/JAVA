import java.util.ArrayList;
import java.util.Vector;
import chapter11.MyVecotor;

public class chapter11 {
    public static void main(String[] args) {
        //List, set Map
    ArrayList list = new ArrayList(10); //길이가 10인 객체배열
        list.add("java");
        list.add("python");
        list.add(124); //list.add(new Integer(333)); 원래는 이렇게 wrapper로 해야하지만 오토박싱으로 개선해줌
        //컴파일시 자동적으로 코드가 실행됨
        list.add(0,"hello");
        //인덱스번호를 주면 인덱스 번호자리에 값이 저장됨
       // System.out.println(list);

        //System.out.println(list.indexOf("java"));
        list.remove("java");
        //System.out.println(list);

        list.set(1,"bool");

//        for (int i=0;i<list.size(); i++) {
//            list.set(i,i);   //set(int index , 넣고자하는값)
//        }
        //System.out.println(list);
        //System.out.println(list.get(2));

//        for (int i=0 ; i<list.size(); i++){
//            list.remove(i);
//        }
//        System.out.println(list);

        for (int i=list.size()-1 ; i>=0; i--){
            list.remove(i);
        }
        //System.out.println(list);

//        Vector v = new Vector(5);
//        v.add("1");
//        v.add("2");
//
//        v.trimToSize(); //빈 공간을 없애 용량과 크기가 같아짐
//        v.ensureCapacity(6); //용량을 6으로 늘림
//        v.setSize(10); //크기를 10으로함
//
//        v.clear();

        MyVecotor v = new MyVecotor();
        System.out.println(v.size());
        System.out.println(v.capacity());




    }
}


