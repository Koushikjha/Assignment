package SumUpBST;

import java.util.*;

public class TopView {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    class Pair{
        Node node;
        int h;
        Pair(Node node, int h){
            this.node=node;
            this.h=h;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(root,0));
        while(!que.isEmpty()){
            Pair curr=que.poll();
            Node node=curr.node;
            int h=curr.h;
            map.putIfAbsent(h,node.data);
            if(node.left!=null) que.add(new Pair(node.left,h-1));
            if(node.right!=null) que.add(new Pair(node.right,h+1));

        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {

    }

}
