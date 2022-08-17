import java.io.FileOutputStream;
import java.util.*;

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



//            Object[] objArr = {"1",1,"2","3","3","2"};
//            Set set = new HashSet();
//
//            for (int i=0;i< objArr.length;i++){
//                set.add(objArr[i]);
//
//            }
//        System.out.println(set);

//        HashMap map  = new HashMap();
//        map.put("he","1234");
//
//        Map map  =new HashMap();
//        map.put("first","1111");
//        map.put("second","2222"); //데이터넣기
//        System.out.println(map);
//
//        Set set  = map.keySet(); //키값은 set에다가 넣음
//        System.out.println(set); //키값만 추출함
//
//        System.out.println(map.values()); // 값들만 추출함
//
//        System.out.println(map.get("first")); //키값에 따른 value값을 추출함
//        System.out.println(map.getOrDefault("third","x")); //키값이 third가 없으면 x를 반환해라
//
//        //map.remove("first"); //map의 원소를 삭제함
//
//
//        Set set2  =map.entrySet(); // 또는 map.keySet() Iteraotr는 map을 지원하지 않기 때문에 set으로 바꿔야함
//        Iterator it = set2.iterator();
//
//      //  키값만 출력
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        //value값도 출력
//        while(it.hasNext()) {
//            Map.Entry en = (Map.Entry) it.next();
//            System.out.println(en.getKey());
//            System.out.println(en.getValue());
//        }


        Map map2 = new TreeMap();
        map2.put("frist",1111);
        map2.put("zero",2222);
        map2.put("aaa",3333);
        System.out.println(map2); //정렬된 상태로 출력


        Properties p = new Properties();
        p.setProperty("autosave","5");
        p.setProperty("language","한글");

        System.out.println(p.getProperty("autosave"));//autosave값 찾기

        try { //파일로 저장하기
            p.store(new FileOutputStream("out.txt"),"pro Ex");
            p.storeToXML(new FileOutputStream("out.xml"),"pro.xm");
        } catch (Exception e) {
            e.printStackTrace();
        }


        ArrayList<Integer> list = new ArrayList<Integer>(); //integer만 들어감

        ArrayList<Object> list1 = new ArrayList<Object>(); //모든 형태를 넣으려면
        list1.add(10);
        list1.add("20");
        String i = (String)list1.get(1); //list.get이 Object여서 형변환을 해주어야함


//        HashMap<String,Value> map = new HashMap<>(); //생성자에는 형을 지정하지않아도됨
//        map.put("hello",new Value("자바","파이썬"));
//
//        class FruitBox<T extends Fruit> {}
//        FruitBox<Apple> apple = new FruitBox<Apple>();


    }
}
class Unit {
    int x,y;
    enum Driection { EAST(5) , SOUTH(3); //;가 있어야함

        private final int value; //인스터스 변수 추가가

        Driection(int value) { this.value = value;} //생성자 추가

        public int getValue() { return value};
   };
    Driection dir; //열거형 인스턴스 변수

    void init() {
        dir = Driection.EAST; //EAST로 초기화
    }

    void compare() {
        if (dir == Driection.EAST) {  //비교는 ==와 compare만 가능 비교연산자불가능
            x++;
    }
        else if (dir.compareTo(Driection.SOUTH) > 0) {}
}



class Card {
    Card(Kind kind) {
        this.kind = kind;
    }

    enum Kind { CLOVER , HERAT , DIAMOND}

    final Kind kind;
}


