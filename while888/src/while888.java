public class while888 {

    public static void main(String args[]) {

        long k = 8, g = 1, m = 8;
        int i = 1;

        while (i < 10) {
            i++;
            g = g * 10;
            k = k + 8 * g;
            m = m + k;
        }

        System.out.println(m);
    }
}
