public class chapter8 {
    public static void main(String[] args) throws Exception {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println(e.getMessage());
            System.out.println("공간확보 필요");
        } catch (MemoryException me) {
            System.out.println(me.getMessage());
            System.out.println("다시 설치를 시도");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException { //생성한 예외처리 호출
        if (!enoughMeory()) {
            throw new MemoryException("메모리 확보");
        }
        if (!enoughSpace()) {
            throw new SpaceException("공간 부족");
        }
    }

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

    static boolean enoughSpace() {
        return true;
    }

    static boolean enoughMeory() {
        return false;
    }
}


    class SpaceException extends RuntimeException {
        SpaceException(String msg){  //spaceException의생성자
            super(msg); //조상인 RunTime의 생성자 호출
        }
    }
    class MemoryException extends RuntimeException {
        MemoryException(String msg){
            super(msg);
        }
    }

//        method1();
//    }
//        static void method1() throws Exception {
//            method2();
//        }
//        static void method2() throws Exception{
//            throw new Exception();
//        }
//        chapter8.method1();
//        System.out.println("main끝");
//    }
//    static void method1() {
//        try{
//            System.out.println("method1");
//            return; //메서드 종료
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("finally구문");
//        }
//    }



//        System.out.println(1);
//        try {
//            System.out.println(2);
//            System.out.println(0 / 0);
//            System.out.println(3); //실행 xXXX
//        } catch (ArithmeticException ae) {
//            if (ae instanceof ArithmeticException) {
//                System.out.println(4);
//            }
//            System.out.println(5);
//            ae.printStackTrace();
//            System.out.println(ae.getMessage());
//        }
     /*   try {
            Exception e = new Exception("고의발생");
            throw e;

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }*/
//        throw new RuntimeException();
//        catch (Exception e) {
//            System.out.println(6);  //실행 XXX 이미 catch구문이 앞에서 걸림
//        }
//        System.out.println(7);
//    }


