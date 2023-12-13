package 심화1;

import java.util.Scanner;

public class 킹_퀸_룩_비숍_나이트_폰_3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] a = new Integer[]{ 1, 1, 2, 2, 2, 8};

        String b = scan.nextLine();

        String[] strArr = b.split(" ");

        Integer[] d = new Integer[a.length];
        for (int i = 0; i < strArr.length; i++) {
            d[i] = Integer.parseInt(strArr[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append(a[i] - d[i]);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}