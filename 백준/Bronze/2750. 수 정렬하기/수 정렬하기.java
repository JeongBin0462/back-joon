import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            set.add(sc.nextInt());
        }

        List<Integer> sortedList = set.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
