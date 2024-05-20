import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ThreadBuffer implements Runnable {

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

    @Override
    public void run() {
        System.out.println("Run method Runnig");
    }
}
