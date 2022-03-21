import java.util.*;
public class HashSetClass {
    public static  void main(String[]args){
//        int array = new array[1,2,3,4,5];
        List<String> str= new LinkedList<String>();
        str.add("neha");
        str.add("neha");
        str.add("neha1");
        str.add("ajitav");
        str.add("");
        Set<Integer> set = new HashSet<>();
        set.add(123);
        set.add(12322);
        set.add(987);
        set.add(222);
        set.add(0002);
        set.add(000000);
        set.add(0);
        System.out.println(set);


    }
}
