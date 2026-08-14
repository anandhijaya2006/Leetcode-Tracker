// Last updated: 8/14/2026, 6:09:15 PM
1import java.util.HashMap;
2import java.util.Map;
3
4// Solution: HashMap + Doubly Linked List
5class LRUCache {
6    // Each node stores one cache entry
7    private static class Node {
8        int key;
9        int value;
10        
11        Node prev;
12        Node next;
13
14        // Constructor 
15        Node (int key, int value) {
16            this.key = key;
17            this.value = value;
18        }
19    }
20
21    // key -> corresponding node in the doubly linked list 
22    private final Map<Integer, Node> cache;
23    private final int capacity; 
24
25    // Dummy nodes simplify insertion/removal
26    // head.next = LRU node
27    // tail.prev = MRU node
28    // head <-> LRU <-> ... <-> MRU <-> tail
29    private final Node head;
30    private final Node tail;
31
32    public LRUCache(int capacity) {
33        this.capacity = capacity;
34        this.cache = new HashMap<>();
35
36        // Dummy nodes don't represent actual cache entries
37        this.head = new Node(0, 0);
38        this.tail = new Node(0, 0);
39
40        // Initially, head <-> tail
41        head.next = tail;
42        tail.prev = head;
43    }
44    
45    public int get(int key) {
46        Node node = cache.get(key);
47
48        // Key doesn't exist
49        if (node == null) {
50            return -1;
51        }
52
53        // We just accessed this key, so it becomes the MRU
54        removeNode(node);
55        addToMostRecent(node);
56        
57        return node.value;
58    }
59    
60    public void put(int key, int value) {
61        // Case 1 - key already exists
62        if (cache.containsKey(key)) {
63            Node node = cache.get(key);
64
65            // Update its value
66            node.value=value;
67
68            // Updating counts as using the key, so move to MRU position
69            removeNode(node);
70            addToMostRecent(node);
71
72            return;
73        }
74
75                // Case 2 - key doesn't exist
76        Node newNode = new Node(key, value);
77        
78        // Add to HashMap
79        cache.put(key, newNode);
80
81        // New entires are automatically MRU
82        addToMostRecent(newNode);
83
84        // If capacity exceeded, evict the LRU node
85        if (cache.size() > capacity) {
86            // 1st real node after dummy head is the LRU node
87            Node leastRecent = head.next;
88
89            // Remove from linked list
90            removeNode(leastRecent);
91
92            // Remove from HashMap
93            cache.remove(leastRecent.key);
94        }
95    }
96
97    // Remove a node from its current position:
98    // Before: A <-> Node <-> B
99    // After: A <-> B
100    // O(1)
101    private void removeNode(Node node) {
102        Node previous = node.prev;
103        Node next = node.next;
104
105        previous.next = next;
106        next.prev = previous;
107    }
108
109    // Add node immediately before tail
110    // tail.prev is always the current MRU node
111
112    // Before: ... <-> old MRU <-> tail
113    // After: ... <-> old MRU <-> node <-> tail
114    // O(1)
115    private void addToMostRecent(Node node) {
116        Node oldMostRecent = tail.prev;
117
118        oldMostRecent.next = node;
119        node.prev = oldMostRecent;
120
121        node.next = tail;
122        tail.prev = node;
123    }
124}
125
126/**
127 * Your LRUCache object will be instantiated and called as such:
128 * LRUCache obj = new LRUCache(capacity);
129 * int param_1 = obj.get(key);
130 * obj.put(key,value);
131 */