public class chapter13 {
    public static void main(String[] args) {
        Runnable r = new ThreadEx1();
        Thread t1 = new Thread(r);
        t1.start();

        ThreadEx2 t2 = new ThreadEx2();
        t2.start();
    }

}

class ThreadEx1 implements Runnable {
    public void run() {
        for (int i=0; i<50;i++) {
            System.out.println(Thread.currentThread().getName()); //현재 실행중인 스레드
        }
    }
}

class ThreadEx2 extends Thread { //상속
    public void run() {
        for (int i=0; i<50;i++) {
            System.out.println(this.getName());  //Thread클래스의 getName;
        }
    }
}
