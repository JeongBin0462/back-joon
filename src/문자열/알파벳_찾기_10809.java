package 문자열;

import java.util.Scanner;

public class 알파벳_찾기_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            int index = currentChar - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int position : alphabet) {
            System.out.print(position + " ");
        }
        scanner.close();
    }
}
