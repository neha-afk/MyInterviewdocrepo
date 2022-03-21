public class Substrin {
    public static void sum(){
        System.out.println("static method");

    }
//    static {
//        System.out.println("static");
//
//    }
//    {
//        //System.out.println("nonstatic ");
//    }
//    Substrin(){
//        //System.out.println("constructor");
//    }
    // static, main before object, static method,nonstatic, constructor, nonstatic method, after
    //asinghneh
    //nehasingh
    //nehasi
    // asingh

    public  String leftrotate(String s, int k){
        String s1 = s.substring(k);
        String s2 = s.substring(0,k);
        String s3 = s1+s2;


        System.out.println(s3);


        return s1;
    }
    public String rightroatte(String s, int n){

        String s1= s.substring(0,s.length()-n);
        String s2= s.substring(s.length()-n);
        String concnate = s2+s1;
        System.out.println(concnate);
        return s1;
    }
    public static void main(String[]args){
        System.out.println("main before object");
        sum();
        Substrin sb = new Substrin();
        sb.rightroatte("Ravikant",4);
        sb.leftrotate("nehasingh",3);
        //System.out.println("main after object");

    }

}
