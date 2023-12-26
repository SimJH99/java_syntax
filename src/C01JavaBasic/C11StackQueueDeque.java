package C01JavaBasic;

import java.util.*;

public class C11StackQueueDeque {
    public static void main(String[] args) {
//        Stack<Integer> mySt =  new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        pop: 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(mySt.pop()); //30
//
////        peek: 스택에서 마지막 요소 반환. 제거x
//        System.out.println(mySt.peek());    //20
//        System.out.println(mySt);   //10,20
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());
//
////        String 타입 5개 정도 추가후 while문을 통해 모두 출력.
//        Stack<String> myst2 = new Stack<>();
//        myst2.push("hello1");
//        myst2.push("hello2");
//        myst2.push("hello3");
//        myst2.push("hello4");
//        myst2.push("hello5");
//
//        while (!myst2.isEmpty()) {
//            System.out.println(myst2.pop());
//        }

//        웹페이지 방문
//        방문한 사이트 출력 + 뒤로가기 기능 구현
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트 방문일 결우, 해당 주소 push
//        뒤로가기일 경우 해당 주소 pop
//        Stack<String> url_St = new Stack<>();
//        Scanner urlScan =  new Scanner(System.in);
//        System.out.println("방문할 사이트의 주소를 입력해주세요.");
//        String insertUrl = urlScan.nextLine();
//
//        String nowPage = new String();
//        url_St.push("url1");
//        url_St.push("url2");
//        url_St.push("url3");
//        url_St.push("url4");
//        url_St.push("url5");
//        //뒤로가기 내가 구현
//        if(!url_St.isEmpty()){
//            if(insertUrl.equals(url_St.pop())){
//                nowPage = url_St.pop();
//                System.out.println("이전 페이지로 접속합니다." + nowPage);
//            } else {
//                nowPage = url_St.push(insertUrl);
//                System.out.println("새로운 페이지에 접속합니다." + nowPage);
//
//            }
//        } else {
//            nowPage = url_St.push(insertUrl);
//            System.out.println("새로운 페이지에 접속합니다. : " + nowPage);
//        }

//        Stack<String> backwards = new Stack<>();
//        Stack<String> forwards = new Stack<>();
//        while (true){
//            System.out.println("신규사이트 방문시 1번, 앞으로가기 2번, 뒤로가기 3번");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("방문하신 사이트를 입력해주세요");
//                Scanner sc2 = new Scanner(System.in);
//                String input2 = sc2.nextLine();
//                System.out.println("방문하신 사이트는 " + input2 + "입니다");
//                backwards.push(input2);
//            } else if (input.equals(2)) {
//                String temp = forwards.pop();
//                backwards.push(temp);
//                System.out.println("앞으로 가기를 통해 방문한 곳은 " + "입니다.");
//
//            } else{
//                String temp = backwards.pop();
//                forwards.push(temp);
//                System.out.println("뒤로가기로 방문하신 곳은 "+ backwards.peek() + "입니다.");
//            }
//
//        }

////        큐선언
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll());   // 10
//        System.out.println(myQue);  // 20, 30


////        프린터 대기열 예제
////        문서1추가, 문서2추가, 문서3추가
////        while문을 통해 "현재 인쇄중인 문서는 : 문서1"
//        Queue<String> myQue1 = new LinkedList<>();
//        myQue1.add("문서1");
//        myQue1.add("문서2");
//        myQue1.add("문서3");
//
//        while (!myQue1.isEmpty()){
//            System.out.println("현재 인쇄중인 문서는 : " + myQue1.poll());
//        }
//
////        길이의 제한이 있는 큐 : ArrayVlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(5);
////        add와 offer의 차이 : add는 길이가 다 찾을 때 에러를 발생. offer는 공간이 충분할때만 add
//        myQue.add("hello1");
//        myQue.add("hello2");
//        myQue.add("hello3");
//        myQue.add("hello4");
//        myQue.offer("hello5");
//        myQue.offer("hello6");
//        System.out.println(myQue);
////        우선순위큐
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//
//        while (!pq.isEmpty()){
//            System.out.println("현재 인쇄중인 문서는 : " + pq.poll());
//        }


////        프로그래머스 문제 '더 맵게'
//        int[] scoville = {1,2,3,9,10,12};
//        int K = 7;
//
//
//        Queue<Integer> myQue = new PriorityQueue<>();
//        for(int a : scoville){
//            myQue.add(a);
//        }
//
//        int answer = 0;
//
//        while (true) {
//            if(myQue.peek() >= K){
//                break;
//            } else if (myQue.size() == 1 && myQue.peek() < K){
//                answer = -1;
//                break;
//            } else {
//                answer++;
//                int temp = myQue.poll() * myQue.poll() * 2;
//                myQue.add(temp);
//            }
//        }
//
//        System.out.println(answer);

//        Queue<Integer> pq = new PriorityQueue<>(scoville.length);
//        int answer = 0;
//        boolean min = true;
//        //큐에 값넣기
//        for(int i =0 ; i < scoville.length; i++){
//            pq.add(scoville[i]);
//        }
//        int count = 0;
//        // K보다 크면 -1로 리턴하기
//        if(K < pq.peek()){
//            answer = -1;
//        } else {
//            while (min) {
//                if(K > pq.peek()){
//                    int a = pq.poll();
//                    int b = pq.poll();
//                    int newInt = a+(b*b);
//                    pq.add(newInt);
//                    count++;
//                }
//                else if (K < pq.peek()) {
//                    min = false;
//                }
//                else if(pq.size() == 1 && pq.peek() < K){
//                    count++;
//                    min = false;
//                }
//            }
//        }
//        answer = count;

////        ArrayDeque : 양방향에서 데이터를 삽입 / 제거 할 수 있다.
//        Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addFirst(10);
//        myDeque.addFirst(20);
//        System.out.println(myDeque);    //20, 10
//        myDeque.addLast(30);
//        System.out.println(myDeque);    //20, 10, 30
//
//        System.out.println(myDeque.pollFirst());    //20
//        System.out.println(myDeque.pollLast());     //30
//        System.out.println(myDeque);        //10

//        addFirst()
//        addLast()
//        peekFirst()
//        peekLast()
//        pollFirst()
//        pollLast()

        String s = ")()(";
        boolean answer = true;

        Queue<Character> myQueue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')' && myQueue.isEmpty()){
                answer = false;
                break;
            } else {
                if (ch == '(') {
                    myQueue.add('(');
                } else if (ch == ')') {
                    myQueue.poll();
                }
            }

            if(myQueue.isEmpty()){
                answer = true;
            } else {
                answer = false;
            }
        }
        System.out.println(answer);


    }
}
