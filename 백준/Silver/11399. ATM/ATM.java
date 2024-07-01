import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        int prev = 0;    // 이전까지의 대기시간 누적합
        int sum = 0;    // 사람별 대기시간 총합

        for (int n : arr) {
            sum += prev + n;
            prev += n;
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
