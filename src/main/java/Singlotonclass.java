import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Singlotonclass {
   private static Singlotonclass obj;
    //private  volatile static  Singlotonclass obj =null;
   // private static Singlotonclass obj = new Singlotonclass();

    private Singlotonclass() {

    }

    public static void main(String[]args){
        //List<Integer> al= List.of(1,2,3,3);
       // List<Integer> al1 = Arrays.asList(3,445,4);
        List<Integer>al3 = new ArrayList<Integer>(8);
        al3.add(1);
        al3.add(3);
        al3.add(9);
        for(int i =0;i<al3.size();i++){
            i=i*i;
            System.out.println(i);
        }
//        for(Integer i : al3){
//            System.out.println(al3.get(i));
//        }
        List<Integer> al= al3.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(al);
//        al3.stream().map(i->i*i).forEach(e->System.out.println(e) );

    }


//    public static Singlotonclass getInstance() {
//        if (obj == null) {
//            obj = new Singlotonclass();
//
//        }
//        return obj;
//
//    }
//    public static  synchronized  Singlotonclass getInstan(){
//        if(obj==null){
//            obj = new Singlotonclass();
//        }
//        return obj;
//    }
//    public static Singlotonclass getInstance2(){
//        if(obj==null){
//            synchronized (Singlotonclass.class){
//                if(obj==null){
//                    obj = new Singlotonclass();
//
//                }
//            }
//            obj= new Singlotonclass();
//
//        }
//        return obj;
//    }



}
