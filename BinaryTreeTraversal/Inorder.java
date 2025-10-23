package BinaryTreeTraversal;
import java.util.*;

public class Inorder {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return ;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

    public static void main(String[] args) {

    }
}
