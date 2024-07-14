import java.io.*;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                list.remove(list.size() - 1);

                continue;
            }

            list.add(num);
        }

        IntSummaryStatistics statistics = list
                .stream()
                .mapToInt(num -> num)
                .summaryStatistics();

        bw.write(statistics.getSum() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}