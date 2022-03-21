import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatevalues {
    public static String  duplictae(String s){
//        for(int i =0;i<s.length()-1;i++){
//            for(int j=i+1;j<s.length();j++){
//               s.toCharArray();
//            }
//
//        }
        char[] sq  =s.toCharArray();
        String sr = String.copyValueOf(sq);
        Set<Character> hs = new LinkedHashSet<>();
        for(int i =0;i<sq.length;i++){
            hs.add(sq[i]);
        }String h = "";
        for(char a : hs){
            h=h+a;
        }
        System.out.println(h);
        return s;
    }
    public static void main(String [] args){
        String s = "Ajitav";
        //System.out.println(s);
        duplictae("ajitavv");
       // Ajitav
        //ajitv

    }
            }
