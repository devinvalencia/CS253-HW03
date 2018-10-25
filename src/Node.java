class Node {
    private char data;
    private Node next;

    public Node () {
        this(' ', null);   }

    public Node (char d) {
        data = d;   }

    public Node (char d, Node n) {
        data = d;
        next = n;   }

    public void setData (char newData) {
        data = newData;   }

    public void setNext (Node newNext) {
        next = newNext;   }

    public char getData () {
        return data;   }

    public Node getNext () {
        return next;   }

    public void displayNode () {
        System.out.print (data);
    }
}