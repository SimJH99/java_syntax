import com.sun.security.auth.UnixNumericGroupPrincipal;
import com.sun.source.doctree.SeeTree;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
////       Set은 중목없고 순서 없다.
//        Set <String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);
//
//
////        번헉샹둘아 좋아하는 운동 종목 : list로 만들고,
////        좋아하는 종목만 추리도록 set으로 변환
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
////        List를 인자값으로 받아 초기값 세팅 가능
//        Set <String> mySet2 = new HashSet<>(myList);
////        for(String a : myList) {
////            mySet2.add(a);
////        }
//
//        System.out.println("종목" + mySet2);
//        System.out.println(mySet2.size());

////        배열을 인자값으로 받아 set 초기값 세팅
////        String 배열 Set에 넣기
//        String[] myArr = {"java", "python", "C++","C++"};
//        Set <String> mySet3 = new HashSet<>(Arrays.asList(myArr));
//        System.out.println(mySet3);
//
////        int배열 set에 넣기
//        int[] myArr2 = {1,1,2,2,3,3,4,4,5,5};
//        Set <Integer> mySet4 = new HashSet<>();
//        for(int a : myArr2){
//            mySet4.add(a);
//        }
//        System.out.println(mySet4);
//
////        remove
//        mySet3.remove("java");
//        System.out.println(mySet3);
//
//        Set<String> mySet5 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
//        Set<String> mySet6 = new HashSet<>(Arrays.asList("java", "html", "css"));
//
////        교집합 : retainAll
//        Set<String> temp1 = new HashSet<>(mySet5);
//        temp1.retainAll(mySet6);
//        System.out.println(temp1);
//
////        합집합 : addAll
//        Set<String> temp2 = new HashSet<>(mySet5);
//        temp2.addAll(mySet6);
//        System.out.println(temp2);
//
////        차집합 : removeAll
//        Set<String> temp3 = new HashSet<>(mySet5);
//        temp3.retainAll(mySet6);
//        System.out.println(temp3);

//        순서가 없으므르 enhanced for문, iterator사용

//        LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello3");
        mySet.add("hello2");
        mySet.add("hello1");
        System.out.println(mySet);





    }
}
