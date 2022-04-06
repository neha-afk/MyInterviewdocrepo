public class Recursive {
    public static void main(String[] args) {
        System.out.println(fac(4));

    }
    public static int fac(int a){
        if(a==0){
            return 1;
        }
        else if(a<0){
            System.out.println("Error");
            System.exit(1);
        }
        else{
            return fac(a-1)*a;
        }
        return 0;
    }
}
