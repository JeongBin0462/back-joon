import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 1;

        while (true) {
            if (num == 0) {
                bw.write(String.valueOf(result));
                break;
            } else {
                result = result * num;
                num--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}