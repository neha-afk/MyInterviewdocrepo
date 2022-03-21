import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class CompartorTest {

    /*
     * Complete the 'textQueries' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY sentences
     *  2. STRING_ARRAY queries
     */

    public static void main(String [] args) {
        List < String > sentences=new ArrayList<>(List.of("this is a test","this test","oppo","mi oneplus","patiDev","patnishree"));
        List < String > queries=new ArrayList<>(List.of("this a","test"));


        int flag = 0;
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        // Write your code here
        for (int i = 0; i < queries.size(); i++) {

            String[] str = queries.get(i).split(" ");

            for (int j = 0; j < sentences.size(); j++) {

                System.out.println(sentences.get(j) + "<----sentences");
                for (int k = 0; k < str.length; k++) {
                    System.out.println(str[k] + "<----tum to sahi niklo");
                    if (sentences.get(j).contains(str[k])) {
                        System.out.println(flag + "<----flag");
                        flag++;
                        System.out.println(flag + "<----flag++");
                    }
                }
                if (flag == str.length) {
                    System.out.println(sentences.get(j) + "<----sentences " + queries.get(i));
                    l.add(j);

                }
                flag = 0;

            }

            ll.add(l);

            System.out.println(ll+"OOOOO");
           // break;
            for (int i1 = 0; i1 < l.size(); i1++) {
                l.remove(i1);
            }
            System.out.println(ll+"PPPPPPPP");
        }
        System.out.println(ll);
    }
}









