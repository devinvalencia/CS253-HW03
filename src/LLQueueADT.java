class LLQueueADT implements LLQueue {

    private int size;
    private Node front;
    private Node rear;

    public LLQueueADT () {
        size = 0;
        front = null;
        rear = null;
    }

    public boolean empty () {
        return (size == 0);
    }

    public int size () {
        return size;
    }

    public void enqueue (char number) {
        Node newNode = new Node ();
        newNode.setData(number);
        newNode.setNext(null);
        if (this.empty())
            front = newNode;
        else
            rear.setNext(newNode);
        rear = newNode;
        size++;
    }

    public int dequeue () {
        int i;
        i = front.getData();
        front = front.getNext();
        size--;
        if (this.empty())
            rear = null;
        return i;
    }

    public int front () {
        return front.getData();
    }
}