 public class SapientOverride {


    public static void main(String[] args) {
        String s = "Neha";
        String s1 = new String(s);
        String s2 = "Neha";
       // s1=s;
        System.out.println(s1.equals(s));
        System.out.println(s==s2);
//        Parentclass cs = new Childclass();
//
//        cs.sum(5);



    }

}
//  class Childclass extends  Parentclass{
//    public void sum(double a){
//        System.out.println("child1 running");
//
//    }
//      public int sum(int a){
//          System.out.println("child 2 running");
//return 0;

      //}

//}
//class Parentclass {
//    public void sum(int b) {
//        System.out.println("PARENT running");
//        return ;
//
//    }
//}

