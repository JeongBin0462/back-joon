package 문자열;

import java.util.Scanner;

public class 문자열_반복_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();

        String[] d = new String[a];

        for (int i = 0; i < a; i++) {
            String b = scanner.nextLine();

            String[] strArr = b.split(" ");

            int num = Integer.parseInt(strArr[0]);
            String str = strArr[1];

            d[i] = result(num, str);
        }


        for (String e : d) {
            System.out.println(e);
        }
        scanner.close();
    }

    private static String result(int a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b.length(); i++) {
            sb.append(String.valueOf(b.charAt(i)).repeat(Math.max(0, a)));
        }

        return sb.toString();
    }
}
