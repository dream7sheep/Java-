public class for888 {

    public static void main(String args[]) {
        long m = 8, g = 10, k = 8;

        for (int i = 1; i < 10; i++) {
            k = k + 8 * g;
            g = g * 10;
            m = m + k;
        }
        System.out.println(m);
    }
}
