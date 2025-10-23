package BinaryTreeTraversal;
import java.util.*;
public class LevelOrder {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> row=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                row.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(row);
        }
        return list;
    }
}
