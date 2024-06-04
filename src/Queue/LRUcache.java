package Queue;

import java.util.HashMap;
import java.util.Map;

public class LRUcache {

    Map<Integer,Node> map = new HashMap<>();
    int capacity = 5;
    Node head = null , tail = null;

    static class Node{
        Node next;
        Node prev;
        int key;
        int value;

        Node(int key , int  value ){
            this.value = value;
            this.key =  key;
            this.prev = null;
            this.next = null;
        }
    }


    public void put(int key ,int value){
        Node temp;
        // check and update
        if(map.containsKey(key)){
            temp = map.get(key);
            temp.value = value;
            moveTohead(temp);
        }else {
            if(map.size()>=capacity){
                removeTail();
            }

            temp = new Node(key,value);
            map.put(key, temp);
            addTohead(temp);

        }
    }

    public void addTohead(Node temp){
        if(head==null){
            head = tail = temp;
        }else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void removeTail(){
        if(tail.prev!=null)tail.prev.next = null;
        else head =null;

        map.remove(tail.key);
        tail = tail.prev;
    }

    public void moveTohead(Node temp ){
        if(temp==head)return;
        if(temp==tail) tail = temp.prev;

        if(temp.prev!=null) temp.prev.next = temp.next;
        if(temp.next!=null) temp.next.prev = temp.prev;

        temp.next = null;
        temp.prev = null;
        addTohead(temp);
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node temp = map.get(key);
            moveTohead(temp);
            return temp.value;
        }

        return -1;
    }


}
