import java.util.HashMap;
import java.util.HashSet;

public class StringOccurencePrograam {
    public static void main (String []args){
        String str =  new String("AJITAV_ULLU");
        //String res="" ;
//        for(int i=str.length()-1 ;i>=0 ;i--){
//            res +=str.charAt(i);
//
//        }
//        System.out.println(res);

        char[] array = str.toCharArray();
        System.out.println(array);
        //int count =0;
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i =0;i< array.length; i++){
            if(hs.containsKey(array[i]))
            {
                hs.put(array[i],
               hs.get(array[i])+1);
            }
            else{
                hs.put(array[i],1 );
                //count++;
                //System.out.println(array[i]+"mila nahi");

            }
        }
        System.out.println(hs);

    }
}
