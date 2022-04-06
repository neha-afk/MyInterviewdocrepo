public class Missingnumberinarray21march {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,9};
        int n=ar[ar.length-1];
        int sum=n*(n+1)/2;
        int sum1=0;
        int k=1;
        for (int i = 0; i < ar.length; i++){
            //memory menangment jvm padhungi
        sum1+=ar[i];


        }
        System.out.println(sum-sum1);

    }
}
