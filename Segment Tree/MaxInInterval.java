package SegmentTree;

public class MaxInInterval {
    static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        Node(int startInterval,int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }

    }
    public static Node root;
    public static void populate(int[] arr){
        root=build(arr,0,arr.length-1);
    }
    public static Node build(int[] arr, int s, int e){
        if(s==e){
            Node node=new Node(s,e);
            node.data=arr[s];
            return node;
        }
        Node node=new Node(s,e);
        int mid=(s+e)/2;
        node.left=build(arr,s,mid);
        node.right=build(arr,mid+1,e);
        node.data=Math.max(node.left.data,node.right.data);
        return node;
    }
    public static void inorder(){
        callInorder(root);
    }
    public static void callInorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        callInorder(node.left);
        callInorder(node.right);
    }
    public static int maxQuery(int start,int end){
        return findMaxQuery(root,start,end);
    }
    public static int findMaxQuery(Node node,int start,int end){
        if(node.startInterval>=start && node.endInterval<=end){
            return node.data;
        }else if(node.startInterval>end || node.endInterval<start){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(findMaxQuery(node.left,start,end),findMaxQuery(node.right,start,end));
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        populate(arr);
        inorder();
        System.out.println();
        System.out.println(maxQuery(1,2));
    }
}
