public class CheckInterface implements Runnable{
    @Override
    public void run() {

        System.out.println("Running " +Thread.currentThread().getName());
    }
}
