import java.util.Stack;

public class StackImpl {
    public static void stimp(String expression, int index) {
        if(expression.charAt(index) != '['){
            System.out.println(expression+","+index);
            return;
        }
        Stack <Integer>st = new Stack<>();
        for(int i = index ;i<= expression.length();i++){
            if(expression.charAt(i) != '['){
                st.push((int )expression.charAt(i));
                System.out.println(expression+","+index);
            }
            else if(expression.charAt(i) == ']'){
                st.pop();
            }
             if(st.empty()){
                 return ;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stimp("[ABC[23]][89]", 0);

    }
}
