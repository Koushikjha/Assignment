package SegmentTreeII;

public class LazyPropagation {
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
        node.data=node.left.data+node.right.data;
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
    public static void update(int index,int value){
        root.data=callUpdate(root,index,value);
    }
    public static int callUpdate(Node node, int index, int value){
        if(index>= node.startInterval && index<= node.endInterval){
            if(index==node.startInterval && index== node.endInterval){
                node.data=value;
                return node.data;
            }else{
                int leftAnswer=callUpdate(node.left,index,value);
                int rightAnswer=callUpdate(node.right,index,value);
                node.data=leftAnswer+rightAnswer;
                return node.data;
            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        populate(arr);
        inorder();
        System.out.println();
        update(2,2);
        inorder();
    }
}
