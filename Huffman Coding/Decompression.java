package HuffmanCoding;
import java.util.*;
public class Decompression {
    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;
    private class Node {
        Character data;
        int cost;
        Node left;
        Node right;
        Node(Character data,int cost){
            this.data=data;
            this.cost=cost;
            this.left=null;
            this.right=null;
        }
    }
    public Decompression(String feeder,String check) {
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(Character c : feeder.toCharArray()){
            fmap.putIfAbsent(c,0);
            fmap.put(c, fmap.get(c)+1);
        }
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        for(Character key : fmap.keySet()){
            Node node=new Node(key,fmap.get(key));
            pq.add(node);
        }
        while(pq.size()>1){
            Node first=pq.poll();
            Node second=pq.poll();
            Node newNode=new Node('\0',first.cost+ second.cost);
            newNode.left=first;
            newNode.right=second;
            pq.add(newNode);
        }
        Node ft=pq.poll();
        this.encoder=new HashMap<>();
        this.decoder=new HashMap<>();
        this.initEncoderDecoder(ft,"");
        if(check.toLowerCase().equals("encode")){
            System.out.println(Encoder(feeder));
        }else{
            System.out.println(Decoder(Encoder(feeder)));
        }

    }
    private void initEncoderDecoder(Node node,String osf){
        if(node==null){
            return ;
        }
        if(node.left==null && node.right==null){
            this.encoder.put(node.data,osf);
            this.decoder.put(osf,node.data);
        }
        initEncoderDecoder(node.left,osf+'0');
        initEncoderDecoder(node.right,osf+'1');
    }
    public String Encoder(String word){
        StringBuilder sb=new StringBuilder();
        for(char c : word.toCharArray()){
            sb.append(encoder.get(c));
        }
        return sb.toString();
    }
    public String Decoder(String code){
        String key="";
        String ans="";
        for(char c : code.toCharArray()){
            key=key+c;
            if(decoder.containsKey(key)){
                ans=ans+decoder.get(key);
                key="";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String word="abcd";
        Decompression dp=new Decompression(word,"decode");
    }
}
