public class chapter4 {

    public static void main(String[] args)
    {
//        for (int i=0 ; i <=10 ; i ++) {
//            if ( i %3==0)
//                continue;
//            System.out.println(i);
//        };
        Loop1 : for (int i=2 ; i<=9; i++) {
                  Loop2 : for ( int j=1 ; j<=9;j++) {
                        if (j==5)
                         break Loop1;
                        System.out.println(i + " " + j);
                }
            System.out.println();
        }

    };


}
