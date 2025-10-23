package BinaryTreeTraversal;
import java.util.*;
public class PostOrder {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return ;
        }
        inorder(node.left,list);
        inorder(node.right,list);
        list.add(node.val);
    }
}
