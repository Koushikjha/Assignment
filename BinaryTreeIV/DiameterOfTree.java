package BinaryTreeIV;

import BinaryTreeIII.MaxDepth;

public class DiameterofTree {
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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return diameter;
    }
    public int find(TreeNode node){
        if(node==null){
            return 0;
        }
        int l=find(node.left);
        int r=find(node.right);
        int dia=l+r;
        diameter=Math.max(dia,diameter);
        return Math.max(l,r)+1;
    }
}
