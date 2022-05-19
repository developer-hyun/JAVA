import java.util.Scanner;

public class Print_Scanner {
    public static void main(String[] args) {

        System.out.println(10.0/3);
        System.out.printf("%s",Integer.toBinaryString(15));

        Scanner scanner = new Scanner(System.in); //화면에 입력받기

        int num = scanner.nextInt() ; //화면에서 입력받은 정수를 num에 저장

        String input = scanner.nextLine(); //화면에서 입력받은 내용을 input에 저장

        int num1 =Integer.parseInt(input);
    }
}
