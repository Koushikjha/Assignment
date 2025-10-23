package BinaryTreeIV;

public class PathSum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return find(root,targetSum);
    }
    public boolean find(TreeNode node,int sum){
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null && sum==node.val){
            return true;
        }

        return find(node.left,sum-node.val) || find(node.right,sum-node.val);
    }
}
