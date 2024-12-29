package hashmap;
import java.util.*;
public class hashmapImplimentation {
    static class MyHashMap<K, V>/*This is used for parameter of any datatypes*/{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // track the number of entries in map
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){// N - capacity/size of the buckets array
            buckets = new LinkedList[N];
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc = key.hashCode(); // this is hashmethod which can convert any datatype in integer and give hashed key
            return (Math.abs(hc) % buckets.length);
        }
//    traverese the ll and looks for the node with key, if found it return it's index otherwise it return null
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n * 1.0f)/buckets.length;
        }
        public int size(){
            return n;
        }
        public void put(K key, V value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei == -1){ // then we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // this is the update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            } else {
                return null;
            }
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                currBucket.remove(ei);
                n--;
                return currNode.value;
            } else {
                return null;
            }
        }
    }
    public static void main(String[] args){
        MyHashMap<Integer, Integer> hash = new MyHashMap<>();
        hash.put(1,2);
        hash.put(2,4);
        System.out.println("capacity is : " + hash.capacity());
        System.out.println("load is : " + hash.load());
        hash.put(3,6);
        hash.put(1,10);
        System.out.println(hash.size());
        System.out.println("capacity is : " + hash.capacity());
        System.out.println("load is : " + hash.load());
    }
}
