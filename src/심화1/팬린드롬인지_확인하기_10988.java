package 심화1;

import java.util.Scanner;

public class 팬린드롬인지_확인하기_10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        StringBuilder sb = new StringBuilder(a);

        sb.reverse();

        if (a.contentEquals(sb)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}