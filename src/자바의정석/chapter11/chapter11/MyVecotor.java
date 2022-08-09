package chapter11;


public class MyVecotor {
    Object[] objArr; //vector값을 담을 객체 배열
    int size; //크기

    public MyVecotor(int capacity) { //생성자
        //유효성 검사
        if (capacity <0) {
            throw new IllegalArgumentException("음수");
        }

        objArr = new Object[capacity]; //해당 크기의 객체배열 생성
    }

    public MyVecotor() { //기본생성자 크기를 지정하지않으면 위에 생성자를 호출함 크기가 10
        this(10);
    }

    public int size() {return size;} //크기반환
    public int capacity() {return objArr.length;} //용량반환
    boolean isEmpty() { return size==0;}

    void clear() {
        for (int i=0; i< objArr.length; i++){
            objArr[i] = null;
        }
        size =0;
    }
}
