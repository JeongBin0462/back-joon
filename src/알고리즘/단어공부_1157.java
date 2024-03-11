package 알고리즘;

import java.io.IOException;
import java.util.Scanner;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }

        }
        System.out.println(maxAlphabet);
    }

    private static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                count[ch - 'A']++;
            } else {
                count[ch - 'a']++;
            }
        }
        return count;
    }
}
