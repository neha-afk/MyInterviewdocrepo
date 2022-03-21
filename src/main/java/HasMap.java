

import java.util.HashMap;
import java.util.Map;
public class HasMap {
    public static void main(String []args){
        Map<Integer,Integer> mp = new HashMap<>();
        int a[]= {2,2,3,1,4,5,6,7,8};
        int target = 9;
        int count =0;
        for(int i =0 ;i< a.length;i++){
            if(mp.containsKey(target-a[i])){
                count++;
                mp.remove(a[i]);
                System.out.println(count+"  "+ a[i] +" ");
            }
            else {
                mp.put(a[i],i);

            }
        }
    }
}
