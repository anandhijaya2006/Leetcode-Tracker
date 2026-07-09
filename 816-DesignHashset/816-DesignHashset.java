// Last updated: 7/9/2026, 3:07:47 PM
class MyHashSet {
    private boolean[] ab;

    public MyHashSet() {
        ab = new boolean[1000001];
        Arrays.fill(ab, false);
    }
    
    public void add(int key) {
        ab[key] = true;
    }
    
    public void remove(int key) {
        ab[key] = false;
        
    }
    
    public boolean contains(int key) {
        return ab[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */