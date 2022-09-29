public class TranspositionNum {
    public static void main(String[] args) {
        int m, n, a, b;
        for (int i = 11; i < 100; i++) {
            for (int j = 11; j < 100; j++) {
                m = i / 10 + j / 10;
                n = i % 10 + j % 10;
                if (i % 10 == 0 || j % 10 == 0) {
                    System.out.print("");
                } else {
                    if (m == n) {
                        a = i % 10 * 10 + i / 10;
                        b = j % 10 * 10 + j / 10;
                        System.out.println(i + "+" + j + "=" + a + "+" + b);
                    }
                }

            }
        }
    }
}
