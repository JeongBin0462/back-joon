import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine().trim());

        String[] split = getStrings(input);
        int length = split.length;
        int result = 0;

        switch (length) {
            case (1):
                result = input;
                break;
            case (2):
                result = input;
                break;
            case (3):
                result = get한수(input);
                break;
            case (4):
                result = get한수(input);
                break;
            default:
        }

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String[] getStrings(int input) {
        String str = String.valueOf(input);
        return str.split("");
    }

    private static int get한수(int input) {

        int count = 99;

        for (int i = 100; i <= input; i++) {
            String[] split = getStrings(i);

            String str3 = split[2];
            String str2 = split[1];
            String str1 = split[0];

            if (Integer.parseInt(str3) - Integer.parseInt(str2) == Integer.parseInt(str2) - Integer.parseInt(str1))
                count++;
        }
        return count;
    }
}
