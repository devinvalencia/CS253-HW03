class LLStackADT implements LLStack {
    private Node top;
    private int size;

    public LLStackADT() {
        top = null;
        size = 0;
    }

    public boolean empty() {
        return (top == null);
    }
    public int size() { return size; }

    public void push (char number) {
        Node newNode = new Node ();
        newNode.setData(number);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public char pop () {
        char i;
        i = top.getData();
        top = top.getNext();
        size--;
        return i;
    }

    public char ontop () {
        char i = pop();
        push(i);
        return i;
    }
}
