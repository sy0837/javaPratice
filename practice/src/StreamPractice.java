import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
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





    synchronized public List<String> withName(String  a){
        return list.stream().map(Student::getFirstName).filter(firstName -> firstName.contains(a)).collect(Collectors.toList());
    }

    synchronized public Map withDepartment(){
        return list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
    }


    synchronized public long count(String  a){
        return list.stream().count();
    }


    synchronized public OptionalInt maxAge(String  a){

        return list.stream().mapToInt(Student::getAge).max();
    }

    synchronized public List<String> allDepName(String  a){
        return list.stream().map(Student::getDepartmantName).distinct().collect(Collectors.toList());
    }

    synchronized public Map<Object, Long> deptCount(String  a){

//        list.stream().collect(Collectors.groupingBy(c -> c.getDepartmantName(), Collectors.counting()));

        return list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
    }

    synchronized public Map genderCount(String  a){
        return list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
    }

    synchronized public Map.Entry<String, Long> maxStudent(String  a){
        return list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();

    }

    synchronized public List<Student> onlyDelhi(){
        return list.stream().filter(x -> x.getCity().equalsIgnoreCase("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());

    }

    synchronized public Map findAvgRank(){
        return list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
    }

    synchronized public Map findHighRank(){
        return list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparing(Student::getRank))));
    }

    synchronized public Student findSecondRank(){

        Optional<String> s = list.stream().map(Student::getDepartmantName).max(Comparator.comparing(String::length));
        return list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().orElseThrow();
    }



}
