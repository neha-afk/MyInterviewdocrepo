public class CustomExceptionExample {
    public static void main(String[] args) throws CustomException1 {

        //0,1,1,2 ,3
//        a=0 b=1 c=1
//            a=1 b=1 c=2
//            a=1 b=2 c=3
//            a= 2 b=3 c= 5
//            a=3 b=5 c=8

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(testException(a, b));
    }

    public static int testException(int a, int b) {
        int n = 10;
        int c=0;
        try {
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;

                if (c == 89) {

                    throw new CustomException1("pass", new CustomException1("cause"));
                }



            //System.out.println(c);

        }} catch (CustomException1 ex) {
            ex.printStackTrace();
            System.out.println(ex);
            System.out.println(ex.getMessage());

            System.out.println(ex.getCause());
            System.exit(1);
            return c;

        }  finally {
            System.out.println("run nahi  karega");
            return c;
        }

    }
}





