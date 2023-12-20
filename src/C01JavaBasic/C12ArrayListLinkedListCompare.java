package C01JavaBasic;

import C14Interface.InterfaceMain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C12ArrayListLinkedListCompare {
    public static void main(String[] args) {
        //ArrayList와 LinkedList의 값 추가와 값 조회 속도 비교
        
        //값 추가
        long startTime = System.currentTimeMillis();
        List<Integer> myList = new LinkedList<>();

        for(int i = 0; i < 100000; i++){
            myList.add(0,10);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        
        
        
        //값 조회
        long startTime2 = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            myList.get(i);
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}
