import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class ThreadBuffer implements Runnable{

     private Queue<String> queue= new PriorityQueue<>();

     synchronized void addValue()  {
        try {

            System.out.println(Thread.currentThread().getName());
            int i=0;
            i= Math.incrementExact(i);
            String value= "a"+i;
            if(queue.peek() == null) {
                System.out.println("Queue is empty: producer");
                queue.add(value);
                notifyAll();
            }else {
                System.out.println("producer waiting for clean");
                wait();
            }
        System.out.println("Value produced:"+ value);
        }catch (InterruptedException interruptedException){
           //
        }
    }

    synchronized void getValue(){

        System.out.println(Thread.currentThread().getName());
        try {
            if(queue.peek() == null){
                System.out.println("Queue is empty: consumer");
                wait();
            }
            String value = queue.poll();
            System.out.println("Consumer clean");
            notifyAll();
            System.out.println("Value consumed:"+ value);
        }catch (InterruptedException interruptedException){
            //
        }
    }

    void checkNew(){
         System.out.println("");
    }

    static void running(){

         System.out.println("Overide main Running");
    }

    @Override
    public void run() {
         return;
    }

/*
    public static void main(String args[]){
         running();
    }
*/

/*
    @Override
    public int compareTo(Object o) {
        return 0;
    }*/

/*    @Override
    public void run() {
        System.out.println("Run method Running");
    }*/
}
