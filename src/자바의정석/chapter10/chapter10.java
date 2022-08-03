import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class chapter10 {

    public static void main(String[] args)  throws Exception{


        // Calendar cal = new Calendar();  추상클래스이기때문에 인스턴스를 생성 불가
//        Calendar cal = Calendar.getInstance(); //Calendar 클래스를 구현한 클래스의 인스턴스를 반환
//        cal.set(2022, Calendar.AUGUST,6);
//
//        Calendar cal2 = Calendar.getInstance(); //현재 날짜
//
//        long dif = (cal.getTimeInMillis() - cal2.getTimeInMillis())/1000; //getTime은 1/1000초로 구해져서 1000으로 나눔
//        System.out.println("날짜 차이는 " + dif/(24*60*60));

//        Calendar cal3 = Calendar.getInstance();
//        cal3.clear();
//        System.out.println(new Date(cal3.getTimeInMillis())); //Epock TIme

//        Calendar cal4 = Calendar.getInstance();
//        cal4.clear();
//        cal4.set(2022, Calendar.JUNE,30); //6월 //숫자는 5
//        cal4.add(Calendar.MONTH,1); //7월로 변경 //2022,7,30이됨 //숫자는 6
//        cal4.add(Calendar.DATE,1); // 2022.7.31이됨
//        System.out.println(cal4.get(Calendar.MONTH));
//        System.out.println(cal4.get(Calendar.DATE));
//
//
//        cal4.set(2022, Calendar.JUNE,30);
//        cal4.roll(Calendar.MONTH,1); //7월로 변경 //2022,7,30이됨 //숫자는 6
//        cal4.roll(Calendar.DATE,2); //날짜 2증가 add의경우는 월이바뀌지만 roll은안바뀜
//        System.out.println(cal4.get(Calendar.MONTH));
//        System.out.println(cal4.get(Calendar.DATE));

//        int number = 12345;
//        DecimalFormat df = new DecimalFormat("0.00");
//        String result = df.format(number);
//        System.out.println(result);
//
//        DecimalFormat df = new DecimalFormat("#,###.##");
//        Number num = df.parse("1,234,567.89");
//        double d = num.doubleValue();
//        System.out.println(d);
//
//        Date today = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(today));

        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        Date d = df.parse("2022년 1월 2일");
        System.out.println(df2.format(d));





//        cal.set(2017,7,15);
//        System.out.println(cal.get(Calendar.MONTH));
//        cal.set(Calendar.MINUTE,20);



//        int thisYear = cal.get(Calendar.YEAR); //현재 몇년인지 출력
//        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);//현재달의 마지막날
//        int thisDay = cal.get(Calendar.DATE);
//        System.out.println(thisDay);
    }

}
