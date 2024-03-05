package 알고리즘;

import java.io.IOException;
import java.util.Scanner;

public class 대소문자_바꾸기_2744 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        char[] ans = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ('A' <= ch && ch <= 'Z')
                ans[i] = ((char) ('a' + ch - 'A'));
            else ans[i] = ((char) ('A' + ch - 'a'));
        }
        System.out.println("ans = " + ans);
    }
}
