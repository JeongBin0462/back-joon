import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();

        String[] strArr = a.split(" ");

        int result = 0;

        for (String b : strArr) {
            double pow = Math.pow(Integer.parseInt(b), 2);

            result += (int) pow;
        }

        bw.write(String.valueOf(result % 10));

        bw.close();
        br.close();
    }
}