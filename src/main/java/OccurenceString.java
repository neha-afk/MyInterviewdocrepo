import java.util.HashMap;
import java.util.HashSet;

public class OccurenceString {
    public static  void main(String[]args){
//        HashMap<Character,Integer> hs =  new HashMap<>();
        HashSet<Character>hs = new HashSet<>();
        String s = "nehanehaneha";
        for(int i =0;i<s.length();i++){
            hs.add(s.charAt(i));
            //string occurnece
//            if(hs.containsKey(s.charAt(i))){
//                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
//            }
//            else{
//                hs.put(s.charAt(i),1);
//            }

        }
        System.out.println(hs);

    }
}
