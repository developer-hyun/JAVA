import java.util.*;

import chapter11.MyVecotor;

public class chapter11 {
    public static void main(String[] args) {
        //List, set Map
//    ArrayList list = new ArrayList(10); //길이가 10인 객체배열
//        list.add("java");
//        list.add("python");
//        list.add(124); //list.add(new Integer(333)); 원래는 이렇게 wrapper로 해야하지만 오토박싱으로 개선해줌
//        //컴파일시 자동적으로 코드가 실행됨
//        list.add(0,"hello");
//        //인덱스번호를 주면 인덱스 번호자리에 값이 저장됨
       // System.out.println(list);

        //System.out.println(list.indexOf("java"));
//        list.remove("java");
//        //System.out.println(list);
//
//        list.set(1,"bool");
//
////        for (int i=0;i<list.size(); i++) {
////            list.set(i,i);   //set(int index , 넣고자하는값)
////        }
//        //System.out.println(list);
//        //System.out.println(list.get(2));
//
////        for (int i=0 ; i<list.size(); i++){
////            list.remove(i);
////        }
////        System.out.println(list);
//
//        for (int i=list.size()-1 ; i>=0; i--){
//            list.remove(i);
//        }
//        //System.out.println(list);
//
////        Vector v = new Vector(5);
////        v.add("1");
////        v.add("2");
////
////        v.trimToSize(); //빈 공간을 없애 용량과 크기가 같아짐
////        v.ensureCapacity(6); //용량을 6으로 늘림
////        v.setSize(10); //크기를 10으로함
////
////        v.clear();
//
////        MyVecotor v = new MyVecotor();
////        System.out.println(v.size());
////        System.out.println(v.capacity());
////
////        LinkedList list1 = new LinkedList();
////        list1.add(231);
////        list1.add("1djs");
////        System.out.println(list1);
//
//        Queue q = new LinkedList(); //큐는없어서 링크드리스트로 구현
//        Stack s = new Stack();
//
//        s.push("0");
//        s.push("2");
//        s.push("4");
//
//        q.offer("7");
//        q.offer("8");
//        q.offer("9");

//        while(!s.empty()) {
//            System.out.println(s.pop());
//        }
//
//        while(!q.isEmpty()) {
//            System.out.println(q.poll());
//        }

        Deque de = new LinkedList();

        de.push("9");
        de.push("7");
        de.push("5");

//        while(!de.isEmpty()) {
//            System.out.println(de.poll());
//        }

//        Collection c = new ArrayList();
//        Iterator it = c.iterator();
//        System.out.println(it.next());

//
//
//        ArrayList list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//
//        Iterator it = list.iterator(); //Iterator는 일회용이여서 한번만 사용가능
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        it = list.iterator();
//
//
//        int[] arr = {0,1,2};
//        int[] arr2 = Arrays.copyOf(arr,7); // [0,1,2,0,0,0,
//        System.out.println(Arrays.toString(arr2));
//        int[] arr3 = Arrays.copyOfRange(arr,0,7); //[0,1,2,0,0,0,

//        List list = Arrays.asList(1,2,3,5);
//        List list1 = new ArrayList(list);
//        list1.add(6);
//
//        int[] arr = {3,7,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,2)); //값이 2인 인덱스를 반환한다.!!



            Object[] objArr = {"1",1,"2","3","3","2"};
            Set set = new HashSet();

            for (int i=0;i< objArr.length;i++){
                set.add(objArr[i]);

            }
        System.out.println(set);
    }
    

}


