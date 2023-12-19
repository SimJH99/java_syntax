package C01JavaBasic;

public class C08List {
    public static void main(String[] args){
////        list 선언 방법
////        ArrayList<String> myList = new ArrayList<String>();
////        ArrayList<String> myList = new ArrayList<>();
////        가장 일반적인 방식
////        왼쪽엔 인터페이스, 오른쪽엔 구현체
//        List<String> myList = new ArrayList<>();
//
////        초기값 생성방법1: 하나씩 add
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//
//        System.out.println(myList);
//
//
////        초기값 생성방법2: 한번에 add (배열을 이용한 변환)
//        String[] myArr1 = {"java", "python", "c++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));
////        배열이 int인 경우 -> 형변환 이슈 발생
//        int[] myIntArr1 = {1,2,3};
//        List<Integer> myIntList1 = new ArrayList<>();
//        for(int a : myIntArr1){
//            myIntList1.add(a);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
////        add(int index, int element); : 중간에 값 삽입은 기본적으로 성능저하
//        myList.add(1, 15);
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//        System.out.println(myList2);
//
////        addAll(collection 객체) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
//
////        get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 출력.
////        size() : 리스트의 개수 반환
//        for(int i = 0; i < myList.size(); i++){
//            myList.get(i);
//        }
//
//
////        remove : 요소 삭제
////        remove는 value 삭제, index를 통한 삭제
//
////        remove를 통한 index삭제 : 0번쨰
//        myList.remove(0);
//        System.out.println(myList);
////        객체를 통한 삭제 : Integer.value of
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
//
////        set(int index, E element) : index자리에 값 변경
////        마지막자이값 : 100으로 세팅 후 출력
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
////        contains : 특정 값이 있는지 없는지 boolean으로 return
//        System.out.println(myList.contains(30));

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(40);
//
////        indexOf : 몇번 쨰 index에 위치한지 return, 요소가 없으면 -1리턴
////        같은 숫자가 있으면 첫번 쨰 index 값으로 return
//        System.out.println(myList.indexOf(30));
//
////        isEmpty : 값이 비었는지, 안비었는지
//        System.out.println(myList.isEmpty());
//
////        clear() : 전체 삭제
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(myList.isEmpty());


//        List출력

//        리스트안에 배열이 들어오는 경우
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
////        myList.get(1)[0] = 10;
////        myList.get(1)[1] = 20;
////        myList.get(2)[0] = 30;
////        myList.get(2)[1] = 40;
////        myList.get(2)[2] = 50;
//
////        위 list에 값 1,2,3   10,20,30  100,200,300 넣기
//        int count = 1;
//        for(int i = 0; i< myList.size(); i++){
//            for(int j =0; j <myList.get(i).length; j++){
//                myList.get(i)[j] = (j+1) * count;
//            }
//            count *= 10;
//        }
//
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }

////      리스트안에 리스트가 들어오는 경우
//        List<List<Integer>> myList2 = new ArrayList<>();
//        myList2.add(new ArrayList<>());
//        myList2.add(new ArrayList<>());
//        myList2.add(new ArrayList<>());
//
//        for(int i = 0; i < myList2.size(); i++){
//            myList2.get(i).add(10);
//        }
//
//        System.out.println(myList2);


//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
////        리스트정렬1: Collections.sort()
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        리스트정렬2: 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
////        1) String 배열을 List로 변환
//        String[] str = {"hello world", "hello python", "hello linux"};
////        1-1) Arrays.asList
//        List<String> list_str = new ArrayList<>(Arrays.asList(str));
//        System.out.println(list_str);
////        1-2) for문 담기
//        List<String> stringList = new ArrayList<>();
//        for(String a : stringList) {
//            stringList.add(a);
//        }
////        1-3) streamApi
//        List<String > stringList2 = Arrays.stream(str).collect(Collectors.toList());
//
//
//        int[] intArr = {10,20,30,40};
////        2) int배열을 list로 변환
////        2-1) Arrayys.asList사용불가
////        2-2) for문 담기 사용 가능
////        2-3) streamAPI 사용가능
//        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());


//        3) String리스트를 String열로 변환
//        String[] newStr = list_str.toArray(new String[0]);
//        System.out.println(Arrays.toString(newStr));
//        3-1) for문으로 할당
//        List<String> stList = new ArrayList<>();
//        stList.add("hello");
//        stList.add("java");
//        stList.add("world");
//
//        String[] stArr = new String[stList.size()];
//        for(int i =0; i < stArr.length; i++){
//            stArr[i] = stList.get(i);
//        }
////        3-2) streamAPI : 참고만
//        String[] stArr2 = stList.stream().toArray(a->new String[a]);

//        4) int리스트를 int배열로 변환
//        4-1) for문으로 변환
//        4-2) StreamAPI로 변환


//        int[] numbers = {2,1,3,4,1};
//        List<Integer> num_list = new ArrayList<>();
//
//
//        for(int i =0; i < numbers.length-1; i++){
//            for(int j = i+1; j < numbers.length; j++){
//                if(!num_list.contains(numbers[i]+numbers[j]))
//                num_list.add(numbers[i] + numbers[j]);
//            }
//        }
//
//        Collections.sort(num_list);
//        int[] answer = new int[num_list.size()];
//        for(int i = 0; i< num_list.size(); i++){
//            answer[i] = num_list.get(i);
//        }
//
//        System.out.println(answer);





    }
}
