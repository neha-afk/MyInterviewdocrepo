import java.util.Arrays;

public class GreaterElement {
    public static void main(String []args){
        int ar[]={1,2,3,5,6,7,8};
        int sum = 14;
        int i =0;
        int j = 2;

        while(j!=ar.length-1){
            if(ar[i]+ar[i+1]+ar[j]==sum){
                System.out.println(ar[i]+","+ar[i+1]+","+ar[j]);
                return ;
            }
            else if(ar[i]+ar[i+1]+ar[j]>sum) {

                System.out.println("nahi ho paya");
                return;
            }
           else{
               i++;
               j++;
            }









//        int temp = ar[0];
//        int n = ar.length;
//        Arrays.sort(ar);


//        for(int i =1;i< ar.length;i++){
//            if(temp>ar[i]){
//                temp =ar[i];
//            }
//
//        }
       // System.out.println(ar[1]);

    }
        System.out.println("kuch nahi mila");
}}
