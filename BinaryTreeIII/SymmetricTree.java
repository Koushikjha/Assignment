package BinaryTreeIII;

public class SymmetricTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        return find(root.left,root.right);
    }
    public boolean find(TreeNode l,TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r==null){
            return false;
        }
        if(l.val==r.val){
            return find(l.left,r.right) && find(l.right,r.left);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
