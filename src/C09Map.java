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
////        enhanced for : key값 하나씩 출력.
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

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = new String();

        Map <String, Integer> comMap = new HashMap<>();

//        for(int i = 0; i < completion.length; i++){
//            if(!comMap.containsKey(completion[i])){
//                comMap.put(completion[i],1);
//            } else {
//                int n = comMap.get(completion[i]);
//                comMap.put(completion[i], n+1);
//            }
//        }
//
//        for(int i = 0; i<participant.length; i++){
//            if(!comMap.containsKey(participant[i])){
//                answer += participant[i];
//            } else if (comMap.containsKey(participant[i]) && comMap.containsValue(1)) {
//                answer += participant[i];
//            }
//        }
//
//        System.out.println(answer);

        Map<String, Integer> participant_map = new HashMap<>();

        for(String a : participant){
            participant_map.put(a, participant_map.getOrDefault(a,0)+1);
        }

        for(String a : completion){
            if(participant_map.get(a) > 1){
                participant_map.put(a, participant_map.get(a)-1);
                continue;
            }
            if(participant_map.get(a) == 1){
                participant_map.remove(a);
            }
        }

        for(String a : participant_map.keySet()){
            answer = a;
        }

        System.out.println(answer);



    }
}
