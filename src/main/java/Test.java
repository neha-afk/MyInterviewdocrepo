import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static String store(String str) {
        String s = "";

        for(int i = 0; i <str.length(); i++) {
            //str.split(" ");
            s += str.charAt(i);
            System.out.println(s);
        }
        return s;
        }

        public static void main (String[]args){

            String str = "Neha Singh";
            String [] st = str.split(" ");
            System.out.println();
            for(int i =0;i<st.length;i++) {
                //System.out.print(store(st[i]));
            }


        }
    }

