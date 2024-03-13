package 알고리즘;

import java.util.Scanner;

public class 문서_검색_1543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String doc = scanner.nextLine();
        String word = scanner.nextLine();

        String replaced = doc.replace(word, "");

        int length = doc.length() - replaced.length();
        int count = length / word.length();

        System.out.println(count);
    }
}