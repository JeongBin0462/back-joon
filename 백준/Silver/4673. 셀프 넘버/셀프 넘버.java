import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        boolean[] arr = new boolean[10000];

        for (int i = 0; i < 10000; i++) {

            int sum = i;

            sum += Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();

            if (sum < 10000) {
                arr[sum] = true;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
