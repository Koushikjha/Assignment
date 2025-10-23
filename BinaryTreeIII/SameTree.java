package BinaryTreeIII;

public class SameTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return find(p,q);
    }
    public boolean find(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val==q.val){
            return find(p.left,q.left) && find(p.right,q.right);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
