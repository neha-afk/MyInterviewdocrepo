import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamlist {


    List<Integer>al3 = Arrays.asList(2,3,4,6);


    public static void main(String []args){
            List<Integer> al1 = new ArrayList<>();
            al1.add(2);
            al1.add(3);
            List<Integer> al = List.of(2,3,4,6,8,9);
            List<Integer>evenlist = new ArrayList<>();
            for(int i =0;i<al.size();i++){
                if(i%2==0){
                    evenlist.add(i);
                    //al.remove(al1);
                    //al.replaceAll();
                    System.out.println("even apppedddd"+evenlist+i);
                }


        }
            for(int i1 :al1){
                if(i1%2==0){
                    evenlist.add(i1);
                    System.out.println("even na "+evenlist+i1);
                }

            }
            Stream<Integer> stram = al1.stream();
            List<Integer> newlist= stram.filter(i->i%2 ==0).collect(Collectors.toList());
        System.out.println("even ---na "+newlist);
        List<Integer>li = al.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(li+"square of numbers");
        List<String>ls =List.of("Neha","Nehaas","Geets","NehaRavi");
        List<String> str = ls.stream().filter(e-> e.startsWith("N")).collect(Collectors.toList());
        System.out.println(str);




    }
}
