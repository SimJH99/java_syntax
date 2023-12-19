package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//합계가 6이상 모든 순열 add : temp.size변화, 길이제한
public class C1209Permutation2 {
    static boolean[] visited;
    static List<List<Integer>> result;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        visited = new boolean[myList.size()];
        result = new ArrayList<>();

        for(int i = 2 ; i <= myList.size(); i++){
            permutation2(myList, visited, result, temp, i);
        }

        System.out.println(result);
    }


    static void permutation2(List<Integer> myList, boolean[] visited, List<List<Integer>> combinations, List<Integer> temp1, int n){
        if(temp1.size() == n){
            int sum = 0;
            for(int i = 0; i < temp1.size(); i++){
                sum += temp1.get(i);
            }

            if(sum >= 6){
                result.add(new ArrayList<>(temp1));
            }
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if(visited[i] == false){
                visited[i] = true;
                temp1.add(myList.get(i));
                permutation2(myList, visited , combinations, temp1, n);
                temp1.remove(temp1.size()-1);
                visited[i] = false;
            }
        }
    }
}
