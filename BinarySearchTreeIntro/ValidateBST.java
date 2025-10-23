package BinarySearchTree;
import java.util.*;

public class ValidateBST {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        find(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }

        }
        return true;

    }
    public void find(TreeNode node,List<Integer> list){
        if(node==null){
            return ;
        }
        find(node.left,list);
        list.add(node.val);
        find(node.right,list);
    }
}
