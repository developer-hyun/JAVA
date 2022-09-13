package home;

public class Re_chapter6 {
    public static void main(String[] args) {

    }

    static long fact(int n) {
        long result = 0;
        if (n==1) {
            result = 1;
        }
        else {
            result = n * fact(n - 1);
        }
        return result;
    }
}

class Test {
    Test() {}
}


