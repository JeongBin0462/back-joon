import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 1; i < number; i++) {
            int sum = i;
            int q = i;

            while (q != 0) {
                sum += q % 10;
                q /= 10;
            }

            if (sum == number) {
                result = i;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}