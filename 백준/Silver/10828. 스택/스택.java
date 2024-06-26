import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    static class Stack {
        private final List<Integer> list = new ArrayList<>();

        public void push(int x) {
            list.add(x);
        }

        public int pop() {
            return list.isEmpty() ? -1 : list.remove(list.size() - 1);
        }

        public int size() {
            return list.size();
        }

        public int empty() {
            return list.isEmpty() ? 1 : 0;
        }

        public int top() {
            return list.isEmpty() ? -1 : list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine().trim());
        Stack stack = new Stack();

        for (int i = 0; i < count; i++) {
            String str = br.readLine().trim();

            if (str.startsWith("push")) {
                int x = Integer.parseInt(str.split(" ")[1]);
                stack.push(x);
            } else {
                Function<Stack, Integer> function = null;
                switch (str) {
                    case "pop":
                        function = Stack::pop;
                        break;
                    case "size":
                        function = Stack::size;
                        break;
                    case "empty":
                        function = Stack::empty;
                        break;
                    case "top":
                        function = Stack::top;
                        break;
                    default:
                }

                if (function != null) {
                    bw.write(function.apply(stack) + "\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
