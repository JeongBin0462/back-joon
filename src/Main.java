import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        int A = Integer.parseInt(strArr[0]);
        int B = Integer.parseInt(strArr[1]);
        int V = Integer.parseInt(strArr[2]);

        int 일 = (int) Math.ceil((double)(V - B) / (A - B));

        System.out.println(일);
    }
}
