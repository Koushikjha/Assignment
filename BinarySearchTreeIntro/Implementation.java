package BinarySearchTree;

public class Implementaion {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode root;

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        build(arr);
        inorder(root);
    }
    public static void build(int[] arr){
        for(int i=0;i<arr.length;i++){
            root=populate(arr[i],root);
        }
    }
    public static TreeNode populate(int val,TreeNode node){
        if(node==null){
            node=new TreeNode(val);
            return node;
        }
        if(val<node.val){
            node.left=populate(val,node.left);
        }
        if(val>node.val){
            node.right=populate(val,node.right);
        }
        return node;
    }
    public static void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }
}
