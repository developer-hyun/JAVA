package 생활코딩;


// static이란 무엇일까???????
public class WhatisStatic {
    //static - class method
    //no static - instance method
    public static void main(String[] args) {
        //instance
        Print t1 = new Print();  //t1은 Print의 instance
        t1.delimiter = "=";
        //메소드가(a) 인스턴스의 소속일 때는 static을 빼줘야한다
        t1.a();

        Print t2 = new Print();
        t2.a();



//        String delimiter="-";
//        Print.b(delimiter);
        //Print.a();
    }
}
class Print{
    public String delimiter = "테스트";
    public void a() {
        System.out.println(this.delimiter);
    }
    public void c() {
        System.out.println(this.delimiter);
    }

    public static void b(String delimiter) {
        System.out.println(delimiter);
    }
}
