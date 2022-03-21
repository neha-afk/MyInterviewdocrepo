import java.util.HashSet;

public class Twotargetvaluesum {
    public static void main (String [] args){
        int target = 20;
        int a[] = {10,23,10,5,15,5,2};
        HashSet<Integer> hs =  new HashSet<>();
        for(int i = 0;i<a.length;i++){
            if(hs.contains(target-a[i])){
                System.out.println(a[i]);
            }
            else{
                hs.add(a[i]);
                System.out.println(a[i]+"paris");
            }
        }
    }
}
