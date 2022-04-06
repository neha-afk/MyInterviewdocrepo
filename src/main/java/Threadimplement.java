public class Threadimplement implements   Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("running thread");


        }
    }

    //static class Thread {


        public static void main(String[] args) {
            Threadimplement t = new Threadimplement();
            t.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("running thread main");


            }


        }

    }
//}
