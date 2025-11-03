package HashMapIntro;
import java.util.*;
public class Implementation {
    int size=1_000_000;
    int[] val;
    public Implementation() {
        val=new int[size+1];
        Arrays.fill(val,-1);
    }

    public void put(int key, int value) {
        val[key]=value;
    }

    public int get(int key) {
        return val[key];
    }

    public void remove(int key) {
        val[key]=-1;
    }
}
