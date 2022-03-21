import java.util.*;
public class Arraylistclass {
    public static void main(String[] args) {
//Creating Deque and adding elements
        List<String> list = new LinkedList<String>();
        list.add("ajitav");
        list.add("neha");
        list.add("ravi");
        list.add("tarun");
       list.add(2,"ravikant");
       list.set(2,"ullu");
       list.remove(2);
//        System.out.println(list);


        //for(int i = 0; i < list.size();i++){
           // System.out.println(list.size());
            if(list.size() < 5) {

                System.out.println("error");
            }

        }
    }
//}
