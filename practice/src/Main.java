import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list= new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("chor");
        list.add("bhaggo");
        list.add("run");
        list.add("apple");

        int[] arr= new int[0];

        System.out.println(arr);


        Map<String, Long> map= list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map.keySet());

        ThreadBuffer threadBuffer= new ThreadBuffer();

        CheckInterface checkInterface= new CheckInterface();

        Thread third= new Thread(checkInterface);

        Thread producer= new Thread(()-> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            threadBuffer.addValue();
        });
        Thread consumer= new Thread(threadBuffer::getValue);

        producer.start();
        consumer.start();
        third.start();

        TestingImmutable testingImmutable= new TestingImmutable();

        int c= testingImmutable.getS();
        int d= testingImmutable.checkS(8);

        System.out.println(c +" "+d);

   /*     CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()-> {
            //
         return "";
        }).thenCompose((String val)  -> CompletableFuture.supplyAsync());*/


        ThreadBuffer threadBuffer1= new TestingImmutable();
        threadBuffer1.getValue();
//        threadBuffer1

        System.out.println("Hello world!");

        StreamPractice streamPractice= new StreamPractice();
        System.out.println(streamPractice.allDepName(""));
        System.out.println(streamPractice.deptCount(""));
        System.out.println(streamPractice.findAvgRank());
        System.out.println(streamPractice.findHighRank());
        System.out.println(streamPractice.findSecondRank());
        System.out.println(streamPractice.genderCount(""));
        System.out.println(streamPractice.withName("Aman"));
        System.out.println(streamPractice.onlyDelhi());
        System.out.println(streamPractice.maxStudent(""));
        System.out.println(streamPractice.withDepartment());
        System.out.println(streamPractice.maxAge(""));
        System.out.println(streamPractice.count(""));

    }
}