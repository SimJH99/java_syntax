package C15AnonymousLambda;

import org.w3c.dom.ls.LSException;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
////        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator
////        Comparable 인터페이스에는 compareTo메서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음.
////        Comparator 인터페이스에는 compare메서드가 선언. => 일반적으로 클래스 내에서 직접구현하고있음.
////        Comparator 인터페이스에는 compare메서드가 선언. => 일반적으로 익명객체를 만들어서 활용
//
////        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
////        문자열의 자릿수의 차이가 발생할 때, 그 문자의 유니코드 값의 차이를 반환.
//        String a = "hello";
//        String b = "horld";
//        System.out.println(a.compareTo(b));
//
//        Integer intA = 1;
//        Integer intB = 1;
//        System.out.println(intA.compareTo(intB));
//
//        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//        Collections.sort(myList);  //Comparable의 compareTo메서드를 통해 정렬
//        Collections.sort(myList,Comparator.reverseOrder());
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("심", 24));
//        studentList.add(new Student("조", 36));
//        studentList.add(new Student("이", 33));
//        studentList.add(new Student("홍", 22));
//        studentList.add(new Student("김", 43));
//
//        System.out.println(studentList);
//
////        방법1: Comparator를 익명객체 방식으로 활용하여 정렬, 매개변수 2개
////        나이 기준으로 정렬
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                기본은 오름차순 정렬하려고 시도
//                return o1.getAge() - o2.getAge();
//            }
//        });
//
//
//        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(studentList);
//
////        이름 기준으로 정렬
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        System.out.println(studentList);
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                기본은 오름차순 정렬하려고 시도
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
////        글자 길이로 정렬
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr, ((o1, o2) -> o1.length() - o2.length()));
//        System.out.println(Arrays.toString(stArr));
//
////        Priority Queue 글자길이 순 내림차순
//        Queue<String> myQue = new PriorityQueue<>((o1, o2) -> o2.length()-o1.length());
//
////        3, 30, 34, 5, 9
////        이 숫자로 이루어진 가장 큰 숫자를 구하라
//
//
//
////        방법2: Compareable인터페이스 implements 후 compareTo메서드 구현, 매개변수 1개
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        쓰레드 구현방식: 쓰레드 상속, Runnable방식
        System.out.println("main의 쓰레드 입니다.");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();
        new Thread(() -> System.out.println("새로 만든 쓰레드 입니다.")).start();


        System.out.println("main의 쓰레드 입니다.");
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


//    조상클래스인  Object클래스의 toString을 overriding하여 객체호출시 자동으로 toString메서드 호출
    @Override
    public String toString(){
        return "[이름은 " +  this.name + ", 나이는 " + this.age + "]";
    }

    @Override
    //클래스 안에있는 compareTo
    public int compareTo(Student o) {
        //String안에있는 compareTo
        return this.name.compareTo(o.getName());
    }
}