public class Max_profit_sell {
    public static void main(String[] args) {
        int a[] = {2,3,6,1,2,3};   //{2,3,6,1,2,3}
        int l = 0, r = 1;
        int profitcurr = 0;
        while (r < a.length) {

            if (a[l] < a[r]) {
                int prof = a[r] - a[l];
                if (profitcurr < prof) {
                    profitcurr = prof;
                    System.out.println(a[l]+","+a[r])   ;
                }

            }
            else {

                l=r;

            }
            r++;



        }

        System.out.println(profitcurr );

    }
}
