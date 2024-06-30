import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] array = Arrays.stream(Arrays.stream(arr).toArray()).sorted().toArray();
        for (int i : array) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}