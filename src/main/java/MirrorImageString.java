import java.io.PrintStream;

public class MirrorImageString {

    public static String mirrorimage(String s){
        String st="";
        for(int i =s.length()-1;i>=0;i--){
           st+=s.charAt(i);
        }
        return st;

    }
    public static void main(String[] args) {
        String  st = "neha ne khana";
        String s1 = "";
        String s[]=st.split(" ");
        for(int i=0;i<= s.length-1;i++){
            s1 += mirrorimage(s[i])+" ";
        }
        System.out.println(s1);

    }


}