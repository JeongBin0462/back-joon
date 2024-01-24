package Class1_plus_plus;

import java.io.*;

public class ACM_호텔_10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            int h = Integer.parseInt(split[0]);
            int n = Integer.parseInt(split[2]);

            int floor = n % h;
            int room = n / h;

            if (floor == 0) {
                floor = h;
            } else {
                room += 1;
            }

            StringBuilder sb = new StringBuilder();

            sb.append(floor);
            if (room < 10) {
                sb.append(0);
            }
            sb.append(room);

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
