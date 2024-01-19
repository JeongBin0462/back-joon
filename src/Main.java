import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();

        String[] strArr = a.split(" ");

        long num1 = Long.parseLong(strArr[0]);
        long num2 = Long.parseLong(strArr[1]);

        long result = (num1 + num2) * (num1 - num2);

        System.out.println(result);

        bw.close();
        br.close();
    }
}