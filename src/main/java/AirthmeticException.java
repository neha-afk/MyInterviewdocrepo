public class AirthmeticException extends Throwable {


//        try {
    public static void sum () throws AirthmeticException  {

        try {
            throw new ArithmeticException("Demo");
        } catch (ArithmeticException ex) {
            System.out.println("excption");
        }
    }
    public static void main(String [] args) throws AirthmeticException {
        try {


            sum();
        }
        finally {

        }


                //num = Integer.parseInt("neha");
//                System.out.println(num);
//                String str = null;
//                System.out.println(str.length());
//
//                int a = 70;
//                int b = 90;
//                int c = a / 0;
//                System.out.println("result " + c);
//            } catch (ArithmeticException e) {
//                System.out.println("can't handle");
//            } catch (NullPointerException ex) {
//                System.out.println("Hanlde nullpointer");
//
//            }
//            try {
//                int num = Integer.parseInt("neha");
//                System.out.println(num);
//
//            } catch (NumberFormatException numberFormatException) {
//                try{
//                    int n = 0;
//                    int c =  1/n;
//
//                }
//                catch(ArithmeticException ex ){
//                    System.out.println("array");
//
//                }
//                System.out.println("Numberformat excption");
//
//            }
//            try {
//                int ar[] = new int[5];
//                ar[7] = 9;
//
//            } catch (ArrayIndexOutOfBoundsException ex) {
//                System.out.println("arry out of bound");
//
//            }
//
//
//        }
//        catch(Exception ex ){
//    }
//            }
//        finally {
//            System.out.println("always excute");
//        }


    }
}
