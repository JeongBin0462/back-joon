package 심화1;

import java.util.Scanner;

public class 단어_공부_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        a = a.toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'A']++;
        }

        int max = 0;
        boolean dupli = false;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                dupli = false;
                result = (char) (i + 'A');
            } else if (arr[i] == max && arr[i] != 0 && (char) (i + 'A') != result) {
                dupli = true;
            }
        }

        if (dupli) {
            System.out.println("?");
        } else {
            System.out.println(result);
        }
    }
}
