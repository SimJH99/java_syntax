package C16EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");


//        enhanced for문 : 원본이 변경X -> remove불가
        for(String a : myList){
            System.out.println(a);
//            remove 메서드 없음
        }

//        iterator 사용: 참조하고 있는 원본데이터 삭제 가능 -> remove
        Iterator<String> myIter = myList.iterator();
        while (myIter.hasNext()){
            if(myIter.next().equals("Banana")) {
                myIter.remove();
            }
        }

        System.out.println(myList);

    }
}
