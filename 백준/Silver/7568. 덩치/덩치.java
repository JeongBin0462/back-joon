import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Integer, Integer> 몸무게 = new HashMap<>();
        Map<Integer, Integer> 키 = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String scan = br.readLine();

            String[] s = scan.split(" ");

            몸무게.put(i, Integer.parseInt(s[0]));
            키.put(i, Integer.parseInt(s[1]));
        }

        int[] ranks = new int[count];
        Arrays.fill(ranks, 1);

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i != j && 몸무게.get(i) < 몸무게.get(j) && 키.get(i) < 키.get(j)) {
                    ranks[i]++;
                }
            }
        }

        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }
}
