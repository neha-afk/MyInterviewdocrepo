public class Exception {
    public static void main(String[] args) throws CustomException {
      int a= 10;
      int b =30;
      System.out.println(testexception(a,b));
    }
    public  static int  testexception(int a, int b) throws CustomException {
        int n = 10;
        int c =0;
        c= a+b;

        try {


            for (int i = 0; i < n; i++) {
                if (c <= 89) {
                    throw new CustomException("pass", new CustomException("cause"));
                }
            }

        }
            catch(CustomException ex){
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());

            }

        return c;
    }

    }

