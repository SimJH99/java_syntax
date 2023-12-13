import java.util.*;

public class C09Map {
    public static void main(String[] args) {

////        <String, String> -> Map
////        삽입된 데이터에 순서가 없다.
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
////        size(), isEmpty() 사용가능
//
////        이미 key가 있을경우 puy을 하면 덮어쓰기
//        myMap.put("basketball", "탁구");
//
////        없으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
//        System.out.println(myMap);
//
////        getOrDefault :  key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("tennis", "스포츠"));
//        System.out.println(myMap.containsKey("tennis"));
//
////        remove
//        myMap.remove("baseball");
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
////        enhanced for문 : key값 하나씩 출력.
//        for(String a :myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }

//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");

//        iterator를 통해 key값 하나씩 출력.
//        Iterator<String> myIter = myMap.keySet().iterator();
//        next메서드는 데이터를 소모시키면서 return
//        System.out.println(myIter.next()); //next: 소모
//        System.out.println(myIter);

////        hasNext() : iterator안에 값이 있는지 없는지.
//        while (myIter.hasNext()) {
//            System.out.println(myIter.next());
//        }
//
//        List<String> myList = new ArrayList<>(Arrays.asList("Hello", "java", "world"));
//        Iterator<String> myIter2 = myList.iterator();
//        while(myIter2.hasNext()){
//            System.out.println(myIter2.next());
//        }

//        아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오.
//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//
//        Map <String,Integer> myMap2 = new HashMap<>();
//        for(int i =0; i < myList.size(); i++){
//            if(!myMap2.containsKey(myList.get(i))){
//                myMap2.put(myList.get(i),1);
//            } else {
//                int n = myMap2.get(myList.get(i));
//                myMap2.put(myList.get(i), n+1);
//            }
//        }

//        for(String a : myList) {
//            myMap2.put(a, myMap2.getOrDefault(a, 0) + 1);
//        }
//
//        for(String key : myMap2.keySet()){
//            System.out.println("종목 : " + key + " 인원 수 : " + myMap2.get(key));
//        }

//        프로그래머스문제 완주하지 못한 자
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//
//        Map <String, Integer> myMap = new HashMap<>();
//        Map<String, Integer> participant_map = new HashMap<>();
//
//        for(String a : participant){
//            myMap.put(a, myMap.getOrDefault(a, 0)+1);
//        }
//        for(String a : completion){
//            if(myMap.get(a) == 1){
//                myMap.remove(a);
//            } else {
//                myMap.put(a, myMap.get(a)-1);
//            }
//        }
//        String answer = myMap.keySet().iterator().next();
//
//        System.out.println(answer);

//        LinkedHashMap : 데이터 삽입순서 유지
        Map<String, Integer> myMap1 = new LinkedHashMap<>();
        myMap1.put("hello5", 1);
        myMap1.put("hello4", 1);
        myMap1.put("hello3", 1);
        myMap1.put("hello2", 1);
        myMap1.put("hello1", 1);
        System.out.println(myMap1);

//        TreeMap :key를 통해 데이터 정렬
        Map<String, Integer> myMap2 = new TreeMap<>();
        myMap2.put("hello5", 1);
        myMap2.put("hello3", 1);
        myMap2.put("hello2", 1);
        myMap2.put("hello4", 1);
        myMap2.put("hello1", 1);
        System.out.println(myMap2);



    }
}
