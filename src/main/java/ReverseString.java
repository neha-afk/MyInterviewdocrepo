import javax.print.DocFlavor;

public class ReverseString {
    public static void main(String[] args) {
        String str = "mom";
        String s = "";
//        StringBuffer sbr =  new StringBuffer(str);
//        sbr.reverse();
//        char[] str1 =
//        System.out.println(str1);
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);


//            s = Character.toString(str1[i]);
//            System.out.println(s);

        }
        System.out.println(str);
        if (str.equals(s)) {
            System.out.print(s+"string palidrom");


        }
    }
}
