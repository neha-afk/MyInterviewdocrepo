import java.sql.SQLOutput;

public class Primenumber {
    public static void main(String[] args) {
        int flag=0;
        int ar[]={2,3,4,7,12,67,45};
        for(int i=0;i<=ar.length-1;i++){
            for(int i1 = 2 ;i1<=Math.sqrt(ar[i]);i1++){
                if(ar[i]%i1==0){
                    System.out.println("Number is not prime"+ar[i]);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(ar[i]+"prime number hai");
            }
            flag=0;
        }
    }
}
