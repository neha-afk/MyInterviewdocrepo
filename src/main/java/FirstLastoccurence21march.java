import java.util.HashSet;

public class FirstLastoccurence21march {
    public static void main(String[] args) {
        int ar[]={2,3,5,5,5,5,7,8};
        int a= 5;
        int count =0;
        int j=0;
        for(int i =0;i<ar.length;i++){
            if(ar[i]==a){
                count++;
                 j=i;
            }
        }
        System.out.println(j+"last ocuurce");
        j=(j+1)-count;
        System.out.println(j+"first ocuurence");
        System.out.println(count+"number of occurence(frequency)");


    }

}
