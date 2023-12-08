package 문자열;

import java.util.Scanner;

public class 숫자의_합_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();

        String b = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < b.length(); i++) {
            sum += b.charAt(i) - '0';
        }
        System.out.println(sum);
        scanner.close();
    }
}
