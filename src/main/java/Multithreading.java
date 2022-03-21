public class Multithreading extends  Thread {
    int ar[] ={1,2,3,4};

    public void run(){
        for(int i =0;i<ar.length;i++){
            System.out.println("hiii");

        }
    }

    public static void main(String[] args) {
        Multithreading m = new Multithreading();
        m.start();
        // m.start();
        //m.start();
        //m.run();
        Multi m1 = new Multi();
        m1.start();
       // m1.run();

    }
}
class Multi extends Thread{
    int ar[] ={1,2,3,4};

    public void run(){
        for(int i =0;i<ar.length;i++){
            System.out.println("hi");

        }
    }

}


