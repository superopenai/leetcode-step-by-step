package leetcode146;

import java.util.HashMap;

/**LRU缓存机制
 *
 *
 * 本题使用双向链表加HashMap实现的答案
 *
 * 也可以使用 Java 内置的linkHashMap很简单就能实现想要的结果，记得需要@override removeEldestEntry 方法
 */
class LRUCache {
    private static int cap;
    private static HashMap<Integer, Node> map;
    Node head;
    Node tail;


    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<Integer, Node>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {

        Node node = map.get(key);
        if (node != null) {
            setRightByHead(node);
            return node.value;

        } else {
            return -1;
        }

    }

    public void put(int key, int value) {

        Node node = map.get(key);
        Node newNode = new Node(key, value);
        if (node == null) {
            if (map.size() == cap) {
                Node oldNode = deleteByTail();
                map.remove(oldNode.key);
                addNode(newNode);
                map.put(key,newNode);

            }else {
                addNode(newNode);
                map.put(key,newNode);

            }
        } else {
            node.value = value;
            setRightByHead(node);
        }
    }


    private void removeNode(Node node) {

        node.prev.next = node.next;

        node.next.prev = node.prev;

    }

    private void addNode(Node node) {
        node.next = head.next;
        head.next.prev = node;

        node.prev = head;
        head.next = node;

    }

    private void setRightByHead(Node node) {
        removeNode(node);

        addNode(node);

    }

    private Node deleteByTail() {
        Node tailPrev = tail.prev;
        removeNode(tailPrev);

        return tailPrev;


    }


    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}


/*使用LinkedHashMap实现的答案

class LRUCache {
    private static int cap;
    private  static Map<Integer,Integer> map ;

    public LRUCache(int capacity) {

       this.cap =capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, (float) 0.75,true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return map.size()>capacity;

            }
        };


    }

    public int get(int key) {
        return map.getOrDefault(key, -1);


    }

    public void put(int key, int value) {
        map.put(key,value);



    }
}


 */