import DSA.LongestSubstring;
import inheritence.Bird;
import inheritence.Eagle;
import inheritence.LivingThings;
import lambda.LambdaTest;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));


        System.out.println(list);

/*        int[] arr= new int[0];
        arr[0]=1;

        System.out.println(arr[0]);*/


        System.out.println("@@@@@@@@@");

        String s1= new String("Sumit");
        String s2= new String("Sumit");

        StringBuilder stringBuilder= new StringBuilder("Sumit");
        StringBuilder stringBuilder1= new StringBuilder("Sumit");



        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(stringBuilder == stringBuilder1);
        System.out.println(stringBuilder.equals(stringBuilder1));

        /*Thread thread= new Thread(new ThreadBuffer());*/


/*        List<String> list= new ArrayList<>();

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

        ThreadBuffer threadBuffer1= new ThreadBuffer();

        Thread thread= new Thread(new StreamPractice());
        System.out.println("Running thread");

        thread.start();


//        thread.wait(5000);

        TestingImmutable testingImmutable= new TestingImmutable();

        int c= testingImmutable.getS();
        int d= testingImmutable.checkS(8);

        System.out.println(c +" "+d);

   *//*     CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()-> {
            //
         return "";
        }).thenCompose((String val)  -> CompletableFuture.supplyAsync());*//*


        ThreadBuffer threadBuffer4= new TestingImmutable();
        threadBuffer4.getValue();
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
        streamPractice.compareString();

        System.out.println("----------");

        System.out.println(third.getName());
        System.out.println(producer.getName());
        System.out.println(consumer.getName());
        System.out.println(thread.getName());

        TryAbstarct tryAbstarct= new TryAbstarct() {
            @Override
            void checking() {

            }

            @Override
            void changeType() {

            }
        };
        tryAbstarct.changeType();

        System.out.println(TryEnum.MONDAY.toLower());

*//*        Bird bird= new LivingThings() {
            @Override
            public boolean canBreath() {
                return false;
            }
        };*//*

        LivingThings livingThings= new Bird() {
            @Override
            public boolean canBreath() {
                return false;
            }

            @Override
            public long enhance() {
                return 0;
            }

            @Override
            public String learn() {
                return "";
            }
        };

        Bird bird= new Bird() {
            @Override
            public boolean canBreath() {
                return false;
            }

            @Override
            public String learn() {
                return "";
            }

            @Override
            public long enhance() {
                return 0;
            }
        };


*//*        livingThings.canBreath();
        livingThings.checkTerm();*//*

*//*        LambdaTest lambdaTest= () -> {
//            if(s.equalsIgnoreCase(""))
                System.out.println("Training");
        };*//*



        System.out.println(livingThings.canBreath());
        System.out.println(livingThings.checkTerm());*/

        char maxLen= LongestSubstring.subNonRepeatingString("geeekkkkkgjjj");
        System.out.println("length is -> "+ maxLen);


    }
}