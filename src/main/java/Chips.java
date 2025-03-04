import java.io.PrintWriter;
import java.util.Scanner;

public class Chips {
    private static class Solution {
        private Scanner in_;
        private PrintWriter out_;

        private void put ( int n){
        if (n == 1) {
            out_.print("1 ");
            return;
        }
        put(n - 1);
        out_.print(n + " ");
        remove(n - 1);
    }

        private void remove ( int n){
        if (n == 1) {
            out_.print("-1 ");
            return;
        }
        put(n - 1);
        out_.print(-n + " ");
        remove(n - 1);
    }

        public void run (Scanner in, PrintWriter out){
        in_ = in;
        out_ = out;

        int n = in_.nextInt();
        for (int i = n; i >= 1; i--) {
            put(i);
        }
        out_.println();
    }
    }
}
