package BinaryTreeIII;

import BinaryTreeTraversal.Inorder;

public class MaxDepth {
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
    public int maxDepth(TreeNode root) {
        return find(root,0);
    }
    public int find(TreeNode node,int depth){
        if(node==null){
            return depth;
        }
        return Math.max(find(node.left,depth+1),find(node.right,depth+1));
    }
}
