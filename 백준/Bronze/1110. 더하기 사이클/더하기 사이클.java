import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값
        int num = sc.nextInt();
        int initNum = num;

        // 반복
        int cycle = 0;
        while (true) {

            int tens = num / 10;
            int ones = num % 10;

            num = (ones * 10) + ((tens + ones) % 10);

            cycle++;
            if (num == initNum) break;
        }

        // 출력
        System.out.println(cycle);
    }
}