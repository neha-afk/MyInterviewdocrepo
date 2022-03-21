import java.util.*;

public class Squr {
    public static void main (String args[]){
        int a[]={-6,0,4,7,9,89};
        int a1[] = new int[a.length];
        // {4,16,36,49}
        for(int i=0;i<a.length;i++){
                a1[i]=a[i]*a[i];
            }
//        select max(salary) from tablename where Not In (select max(salary) form tablename)
//        select  *  tablename  from salary  ORDER BY DESC limit(3,1)
        List<Integer> l = new LinkedList<>();
        for(int i=0;i<a1.length;i++) {


            l.add(a1[i]);
           // System.out.println(l);

            //l.stream().sorted();
            //System.out.println(l);
        }
        Collections.sort(l);





            }



        }

