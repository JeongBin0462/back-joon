package Class2;

import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 단어_정렬_1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        Set<String> list = new HashSet<>();

        for (int i = 0; i < a; i++) {
            list.add(br.readLine());
        }

        List<String> collect = list.stream().sorted().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        for (String result : collect) {
            bw.write(result);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
