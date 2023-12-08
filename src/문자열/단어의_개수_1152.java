package 문자열;

import java.util.Scanner;

public class 단어의_개수_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        if (a.isEmpty()) {
            System.out.println(0);
        } else{
            System.out.println(a.split(" ").length);
        }

        scanner.close();
    }
}
