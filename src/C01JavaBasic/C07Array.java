package C01JavaBasic;

public class C07Array {
    public static void main(String[] args) {
////            표현식1
//            int[] int_arr1 = {1,2,3,4};
////            표현식2
//            int[] int_arr2 = new int[4];
//            int_arr2[0] = 1;
//            int_arr2[1] = 2;
//            int_arr2[2] = 3;
//            int_arr2[3] = 4;
////            표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};
//
////        표현식4는 불가 : java의배열은 반드시 길이가 지정되어야함.
////        int[] int_arr4 = new int[];
//
//        int[] arr3 = {85, 65, 90};
//
//        int sum = 0;
//
//        for (int i =0; i < arr3.length; i++) {
//            sum += arr3[i];
//        }
//
//        double avg = (double)(sum / arr3.length);
//
//        System.out.println(sum);
//        System.out.println(avg);

//        최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0];
//        int min = arr[0];
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//
//            sum += arr[i];
//        }
//
//        double avg = (double)(sum / arr.length);
//
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
//        System.out.println("sum = " + sum);
//        System.out.println("avg = " + avg);
//
////        배열의 순서바꾸기
//        int[] arr = {10,20};
//        int temp = 0;
//
//        temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//
//        System.out.printf(Arrays.toString(arr));

//        int[] arr2 = {10,20,30,40,50,60,70};
//        int temp2 = 0;
//        for(int i = 0; i < arr2.length - 1; i++){
//            temp2 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp2;
//        }
//
//        System.out.printf(Arrays.toString(arr2));

////        배열뒤집기
//        int[] arr = {1,2,3,4,5};
////        신규배열 선언
//        int[] arr2 = new int[arr.length];
//
//        for(int i = 0; i < arr2.length; i ++) {
//            arr2[arr2.length - i -1] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));
//
//
////        배열 뒤집기 2
//        int temp = 0;
//        for(int i = 0; i < arr.length/2; i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));


//        String 배열은 초기값이 null값이다.
//        그러므로 아래는 nullException가 난다.
//        String[] arr_st = new String[5];
//
//        for(int i = 0; i < arr_st.length; i++) {
//            if(arr_st[i].isEmpty()) {
//                System.out.println("비어있습니다.");
//            }
//        }

////        정렬 : sort함수 사용
//        int[] arr = {1,3,2,4,6,45,3,4,4,6,2,3,3,23,4,3,4234,234,23,42,34,23,6,34,54,1,35,2,34,6,1,234,4,236,2,3};
////        오름차순 정렬이 기본
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//
////        내림차순
////        방법1. Compareator클래스 사용
////        객체타입인 경우에만 Comparator클래스 사용가능
//
//        String[] str_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(str_arr);
//        System.out.println(Arrays.toString(str_arr));
//        Arrays.sort(str_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(str_arr));
//
//
////        Comparator클래스는 기본형 타입은 처리불가
////        Arrays.sort(arr, Comparator.reverseOrder());
////        방법2. 배열 뒤집기
//
////        배열뒤집기
////        신규배열 선언
//        String[] str_arr2 = new String[str_arr.length];
//        for(int i = 0; i < str_arr2.length; i ++) {
//            str_arr2[str_arr2.length - i -1] = str_arr[i];
//        }
//        System.out.println(Arrays.toString(str_arr2));
//
////        StreamApi, lamdba를 활용한 내림차순 정렬
//        int[] arr2 = {5,1,2,7,3,1,2};
//        int[] new_arr2 = Arrays.stream(arr2) //arr2를 대상으로 stream 객체 생성
//                .boxed()    // Integer로 형변환시킨 스트림 객체 생성
//                .sorted(Comparator.reverseOrder())   //내림차순 정렬
//                .mapToInt(a->a)   //Integer를 int로 변환
//                .toArray();   // 배열로 변환


////        선택 정렬 오름차순
//        int[] arr = {30, 22, 20, 25, 12};
//        int temp = 0;
//        for(int i = 0; i < arr.length-1; i++){
//            for(int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
////        선택정렬 내림차순
//        int[] arr2 = {30, 22, 20, 25, 12};
//        int temp2 = 0;
//        for(int i = 0; i < arr2.length-1; i++){
//            for(int j = i+1; j < arr2.length; j++) {
//                if(arr2[i] < arr2[j]){
//                    temp2 = arr2[i];
//                    arr2[i] = arr2[j];
//                    arr2[j] = temp2;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr2));
//
//
////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질 수 있는 2개의 조합의 합을 출력하라.
//        int[] int_arr = {10,20,30,40,50,60};
//        for(int i = 0; i < int_arr.length-1; i++){
//            for(int j = i+1; j < int_arr.length; j++) {
//                System.out.print(int_arr[i] + int_arr[j] + " ");
//            }
//            System.out.println();
//        }
//
//
//
//        5, 7, 10, 10, 40
//        배열 복사
//        int[] new_temp = Arrays.copyOfRange(temp, 0, 3);

////        중복 제거하기
//        int[] temp = {10,10,40,5,7};
//        int index = 0;
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        for(int i = 0; i < temp.length; i++) {
//            if(i==temp.length-1){
//                new_temp[index] = temp[i];
//                index++;
//                break;
//            }
//            if(temp[i] != temp[i+1]) {
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(new_temp,0,index);
//        System.out.println(Arrays.toString(answer));

////        버블정렬
////        int[] arr3 = {5,1,4,3,2};
////
////        for(int i = 0; i < arr3.length-1; i++){
////            for (int j = 0; j < arr3.length-1-i; j++) {
////                if (arr3[j] > arr3[j+1]) {
////                    int temp = arr3[j];
////                    arr3[j] = arr3[j + 1];
////                    arr3[j + 1] = temp;
////                }
////            }
////        }
////        System.out.println(Arrays.toString(arr3));
//
//        int[] arr3 = {5,1,2,3,4};
//
//        for(int i = 0; i < arr3.length-1; i++){
//            boolean isChanged = false;
//            for (int j = 0; j < arr3.length-1-i; j++) {
//                if (arr3[j] > arr3[j+1]) {
//                    int temp = arr3[j];
//                    arr3[j] = arr3[j + 1];
//                    arr3[j + 1] = temp;
//                    isChanged = true;
//                }
//            }
//            if(isChanged == false){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr3));
////
////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int answer = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 8){
//                answer = i;
//                break;
//            }
//        }
//
////        이진 검색(Binary Search)
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능.
////        이진 검색 알고리즘
//        int[] arr2 = {1,3,6,8,9,11};
//        int answer1 = Arrays.binarySearch(arr,8);
//        System.out.println(answer1);

////        배열간 비교 : equals : 순서까지 동일해야 true
//        int [] arr1 = {10,20,30};
//        int [] arr2 = {10,20,30};
//        System.out.println(Arrays.equals(arr1,arr2));


////        배열 복사 : copyOf(배열, end) copyOfRange(배열, start, end)
////
//        int[] arr = {10,20,30,40,50};
//        int[] new_arr1 = Arrays.copyOf(arr,10);
//        int[] new_arr2 = Arrays.copyOfRange(arr,0,4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));

////        2차원 배열
//        int[][] arr = new int[2][3];
////        1,2,3,4,5,6
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[0][2] = 5;
//        arr[0][3] = 6;
//
////        2차원 가변배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr[0][0] = 10;
////        arr[1][0] = 20;
////        arr[2][0] = 30;
//
//        System.out.println(arr2);
//
////        가변배열 리터럴 방식
//        int[][] arr3 = {{10}, {10,20}, {10, 20, 30}};
//
////        System.out.println(Arrays.deepToString(arr));
////        System.out.println(Arrays.deepToString(arr2));
//        System.out.println(Arrays.deepToString(arr3));


//
////         [3][4]사이즈의 배열을 선언 한 뒤
////        1,2,3 ~ 12까지의 숫자값 각 배열에 할당
//        int[][] arr4 = new int[3][4];
//        int count = 1;
//        for(int i = 0; i < arr4.length; i++){
//            for(int j = 0; j < arr4[i].length; j++) {
//                arr4[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr4));

////        가변배열 만들기 : 전체 사이즈5
////        각 배열마다 사이즈 1,2,3,4,5로 커지도록. : for문
////        count1부터 시작해서 끝날때까지 +1시키면서 데이터 세팅
//        int[][] arr5 = new int[5][];
//        int count = 10;
//        for(int i = 0; i < arr5.length; i++){
//            arr5[i] = new int[i+1];
//            for(int j = 0; j < arr5[i].length; j++){
//                arr5[i][j] = count;
//            }
//            count += 10;
//        }
//        System.out.println(Arrays.deepToString(arr5));
    }
}
