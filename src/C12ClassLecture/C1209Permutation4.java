package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3개 순열에서 가장 가장 큰값을 출력
public class C1209Permutation4 {
    static boolean[] visited;
    static Integer maxValue;
    static List<List<Integer>> result;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        visited = new boolean[myList.size()];
        result = new ArrayList<>();
        int n = 3;
        maxValue = 0;

        permutation4(myList, visited, combinations, 0, 0);

        System.out.println(maxValue);

    }

    static void permutation4(List<Integer> myList, boolean[] visited, List<List<Integer>> combinations, int temp1, int count){
        if(count == 3){
            if(temp1 > maxValue){
                maxValue = temp1;
            }
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if(visited[i] == false){
                visited[i] = true;
                permutation4(myList, visited , combinations, temp1 + myList.get(i) , count+1);
                visited[i] = false;
            }
        }
    }
}
