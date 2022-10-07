package Ans3;

import com.sun.source.tree.SynchronizedTree;

public class Synchro {

    void display(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+ " "+  n);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }


}
class Thread1 extends Thread
{
    Synchro synchro;
    Thread1(Synchro synchro)
    {
        this.synchro=synchro;

    }
    public  void run()
    {
        synchro.display(5);
    }


}
class Thread2 extends Thread {
    Synchro synchro;

    Thread2(Synchro synchro) {
        this.synchro = synchro;

    }

    public void run() {
        synchro.display(5);
    }

}

class syncBlockExample {
    public static void main(String[] args) {
        Synchro obj = new Synchro();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}