package AdvancedRecursion;
import java.util.*;
public class SubsetII {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        find(arr,0,new ArrayList<>(),list);
        return list;
    }
    public void find(int[] arr,int index,ArrayList<Integer> current,ArrayList<ArrayList<Integer>> list){
        list.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue;
            current.add(arr[i]);
            find(arr, i + 1, current, list);
            current.remove(current.size() - 1);
        }
    }

}
