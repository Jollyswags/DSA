class FrontMiddleBackQueue {

     LinkedList<Integer> q;
    
    public FrontMiddleBackQueue() {
        q=new LinkedList<>();
    }
    
    public void pushFront(int val) {
        q.add(0,val);
    }
    
    public void pushMiddle(int val) {
        q.add(q.size()/2,val);
    }
    
    public void pushBack(int val) {
        q.add(val);
    }
    
     public int popFront() {
        if(isEmpty()) return -1;
       
        return q.remove(0);
    }
    
    public int popMiddle() {
        if(isEmpty()) return -1;
        
        return q.remove(findMiddleIndex());
    }
    
    public int popBack() {
        if(isEmpty()) return -1;
        
        return q.remove(q.size() - 1);
    }
    
    private boolean isEmpty(){
        return q.isEmpty();
    }
    
    private int findMiddleIndex(){
        return (q.size() - 1) / 2;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */