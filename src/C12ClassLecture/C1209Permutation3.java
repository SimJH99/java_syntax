package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3개 순열에서 가장 가장 큰값을 출력
public class C1209Permutation3 {
    static boolean[] visited;
    static Integer maxValue;
    static List<List<Integer>> result;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        visited = new boolean[myList.size()];
        result = new ArrayList<>();
        maxValue = 0;
        int n = 3;

        permutation3(myList, visited, combinations, temp, n);

        for(int i = 0; i < combinations.size(); i++){
            int sum = 0;
            for(int j = 0; j < combinations.get(i).size(); j++){
                sum += combinations.get(i).get(j);
            }
            if(sum > maxValue){
                maxValue = sum;
            }
        }

        System.out.println(maxValue);
    }


    static void permutation3(List<Integer> myList, boolean[] visited, List<List<Integer>> combinations, List<Integer> temp1,  int max){
        if(temp1.size() == max){
            combinations.add(new ArrayList<>(temp1));
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if(visited[i] == false){
                visited[i] = true;
                temp1.add(myList.get(i));
                permutation3(myList, visited , combinations, temp1, max);
                temp1.remove(temp1.size()-1);
                visited[i] = false;
            }
        }
    }
}
