class NodeDL {

    private int data;
    private NodeDL next, prev;

    public NodeDL() {
        this(0, null, null);
    }

    public NodeDL(int d) {
        data = d;
        next = null;
        prev = null;
    }

    public NodeDL(int newData, NodeDL newNext, NodeDL newPrev) {
        data = newData;
        next = newNext;
        prev = newPrev;
    }

    public void setData (int newData) {
        data = newData;
    }

    public void setNext (NodeDL newNext) {
        next = newNext;
    }

    public void setPrev (NodeDL newPrev) {
        prev = newPrev;
    }

    public int getData () {
        return data;
    }

    public NodeDL getNext () {
        return next;
    }

    public NodeDL getPrev ()  {
        return prev;
    }

    public void displayDLNode () {
        System.out.print (data);
    }
}
