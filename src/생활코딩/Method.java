package 생활코딩;

public class Method {
    public static void main(String[] args) { //String[]은 문자열 배열   args는 자바가 실행될때 들어오는 값이다. args를 환경변수 설정을 통해 줄수 있음

        System.out.println(one(1,2));
        System.out.println(one("1","2"));
    }
    public static int one(int a,int b){
        return a+b;
    }
    public static String one(String a,String b){
        return a+b;
    }


}  //자바파일을 만들때는 클래스를 만들고 약속된(실행하는)main이라는 메소드를 만들어야 실행이된다(메인메소드)
   // 자바는 클래스 실행시  main메소드를 실행하도록 약속되어있다.


//
//public class Method {
//    public static void main(String[] args) { //String[]은 문자열 배열   args는 자바가 실행될때 들어오는 값이다. args를 환경변수 설정을 통해 줄수 있음
//
//        //System.out.println(Math.floor(1.1));  //printIn도 출력해주는 메소드이다!!
//        printTwoTimes("123"); //printTwoTimes는 메소드이다!
//        // printTwoTimes("123");
//        System.out.println(one()); //one메소드의리턴값은 1이다!!
//    }  //이것도 main이라는 이름을 가진 메소드이다!!
//
//
//    public static void printTwoTimes(String text){  //printTwoTimes라는 이름의 메소드이다! 인자(파라미터로) String을 받는다
//        System.out.println(text);
//        System.out.println(text);
//    }
//
//    public static int one(){
//        return 1;
//    }
//
//
//}  //자바파일을 만들때는 클래스를 만들고 약속된(실행하는)main이라는 메소드를 만들어야 실행이된다(메인메소드)
//// 자바는 클래스 실행시  main메소드를 실행하도록 약속되어있다.
