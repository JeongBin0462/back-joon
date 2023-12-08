import java.util.Arrays;
import java.util.Scanner;

public class Util {

    void 스캐너() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
    }

    void 문자열자르기(String str) {
        String[] strArr = str.split(" ");

        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);
    }

    void 배열채우기 (int[] intArr) {
        Arrays.setAll(intArr, i -> i + 1);
    }

    String 시간계산(int num1, int num2) {
        StringBuilder sb = new StringBuilder();

        // 45보다 클 때
        if (num2 >= 45) {
            num2 = num2 - 45;

            sb.append(num1);
            sb.append(" ");
            sb.append(num2);

            return sb.toString();
        }
        // 45보다 작을 때
        if (num1 > 0) {
            num2 = 60 - (45 - num2);
            num1 = num1 - 1;

            sb.append(num1);
            sb.append(" ");
            sb.append(num2);

            return sb.toString();
        }

        // 시가 0시 보다 작을 때
        num1 = 23;
        num2 = 60 - (45 - num2);

        sb.append(num1);
        sb.append(" ");
        sb.append(num2);

        return sb.toString();
    }

    void 구구단(int a) {
        int i = 1;
        while (i < 9) {
            String sb = a + " * " + i + " = " + a * i;
            i++;

            System.out.println(sb);
        }
    }
}
