package home;

import java.util.Date;

public class TestPackage {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.getTime());
        }

    public static long getTime() {
        Date d1 = new Date();
        long time = d1.getTime();
        return time;
    }
}
