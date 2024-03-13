import java.util.Scanner;

public class Main {
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