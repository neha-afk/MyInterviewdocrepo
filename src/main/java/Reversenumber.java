public class Reversenumber {
    public static void main(String[]args) {
        int n = 98765655;
        if (n < 0) {
            return;
        }
        while (n > 0) {
            int res = 0;
            res = res * 0 + n % 10;
            n = n / 10;
            System.out.print(res);
        }
    }
}
