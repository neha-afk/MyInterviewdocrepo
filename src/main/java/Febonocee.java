public class Febonocee {
    //recursion program///
    public static int rec(int n) {
        if (n <= 1)
            return n;
        return rec(n - 1) + rec(n - 2);
    }

    public static void main(String[] args) {
        //recursion program///
        int n = 10;
        System.out.println("recursion output " + rec(n));
        //recursion program///


        ///normal program///

        int ar[] = new int[n];
        int i = 2;
        ar[1]=1;
        ar[0]=0;
        while (i < n){
            ar[i] = ar[i - 2] + ar[i - 1];
            i++;
        }
        for (i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
}
