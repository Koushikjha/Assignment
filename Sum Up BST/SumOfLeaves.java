package SumUpBST;

public class SumOfLeaves {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public static void main(String[] args) {

    }
    public int sumOfLeftLeaves(TreeNode root) {
        return findSum(root);
    }
    int findSum(TreeNode node){
        if(node==null){
            return 0;
        }
        int sum=0;
        if(node.left!=null && node.left.left==null && node.left.right==null){
            sum+=node.left.val;
        }
        sum+=findSum(node.left);
        sum+=findSum(node.right);
        return sum;
    }
}
