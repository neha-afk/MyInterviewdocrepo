import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {
        String a="add";
        String b ="dad";

        if(a.length()!=b.length()){
            System.out.println("Not Anagram");
            return;
        }
        char[] s1=a.toLowerCase().toCharArray();
        char[] s2=b.toLowerCase().toCharArray();
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=0;i<s1.length;i++){
            if(hp.containsKey(s1[i])){
                hp.put(s1[i],hp.get(s1[i])+1);
            }
            else{
                hp.put(s1[i],1);
            }
        }
        for(int i=0;i<s2.length;i++){
            if(hp.containsKey(s2[i])){
                if(hp.get(s2[i])==0){
                    System.out.println("Not Anagram");
                    return;
                }
                else{
                    hp.put(s2[i],hp.get(s2[i])-1);
                }
            }
            else{
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");


    }
}
