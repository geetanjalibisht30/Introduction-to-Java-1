import java.util.concurrent.CountDownLatch;

public class Ans1 {
    public static void main(String[] args) {

        RunableClass tc = new RunableClass();
        Thread T = new Thread(tc);
        T.start();
        TheardClass obj = new TheardClass();
        TheardClass obj1 =new TheardClass();
        //  TheardClass obj2 = new TheardClass();
        obj.start();
           try{
                obj1.join();
            }
            catch (InterruptedException a){
                a.printStackTrace();
            }

    }

    static class RunableClass implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("  " + i);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(" ____________Runable___Thread_________ ");
        }
    }

    static class TheardClass extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("  " + i);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" Threadclass");
        }
    }
}


