package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//순열 2개 집합에서 원소 두 개의 합이 6 이상인 것만 add
public class C1209Permutation1 {
    static boolean[] visited;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        visited = new boolean[myList.size()];
        int n = 2;

        permutation1(myList, visited, combinations, temp, n);

        System.out.println(combinations);
    }

    static void permutation1(List<Integer> myList, boolean[] visited, List<List<Integer>> combinations, List<Integer> temp1, int n){
        if(temp1.size() == n){
            int sum = 0;
            for(int i = 0; i < temp1.size(); i++){
                sum += temp1.get(i);
            }

            if(sum >= 6){
                combinations.add(new ArrayList<>(temp1));
            }
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if(visited[i] == false){
                visited[i] = true;
                temp1.add(myList.get(i));
                permutation1(myList, visited , combinations, temp1, n);
                temp1.remove(temp1.size()-1);
                visited[i] = false;
            }
        }
    }
}


