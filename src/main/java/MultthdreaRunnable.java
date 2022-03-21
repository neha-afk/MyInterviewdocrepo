public class MultthdreaRunnable  {


    public static void main(String[]args) {
        Runnable r = ()->
                System.out.println("run111");





        Thread t1 = new Thread();
        t1.start();
        Multi m1 = new Multi();
        Thread t2 = new Thread(m1);
        t2.start();

    };
}
class Rmuti implements  Runnable{

    @Override
    public void run() {
        System.out.println("run");

    }
}
