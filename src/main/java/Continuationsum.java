public class Continuationsum {
    public static void main(String[]args){
        int n = 959;
        int m =123;
        System.out.println("before swap n= "+n+ " m= "+m);
         n = n+m;
         m= n-m ;
         n= n-m;
//        n=n+m-(m=n);
         System.out.println("after swap n= "+n+ " m= "+m);

 int num=100009; // find the number of 0
         m =0;
        int count =0;
        while (num > 0) {
            m = num%10;
            if(m==0){
              count++;
            }
            num=num/10;
//            10009/10;
//            1000%10
        }
        System.out.println(count);

//        int temp_n = n;
//        int res = 0;
//        while(n>0){
//            res = res*10 + n%10;
//            n=n/10;
//
//        }
//        if(temp_n!=res){
//            System.out.println(n+" not Plindrom");
//        }
//        else{
//            System.out.println(" Palindrom");
//        }


    }
}
