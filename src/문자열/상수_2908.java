package 문자열;

import java.util.Scanner;

public class 상수_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        String[] strArr = a.split(" ");
        Integer[] reverseArr = new Integer[2];

        for (int i = 0; i < strArr.length; i++) {
            reverseArr[i] = result(strArr[i]);
        }

        Integer c = reverseArr[0] > reverseArr[1] ? reverseArr[0] : reverseArr[1];

        System.out.println(c);

        scanner.close();
    }

    private static int result(String a) {
        StringBuilder reverse = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse.append(a.charAt(i));
        }

        return Integer.parseInt(reverse.toString());
    }
}