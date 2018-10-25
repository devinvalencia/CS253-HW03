class LinkListADT implements LinkList {

    private Node first;

    public LinkListADT () {
        first = null;  }

    public boolean empty () {
        return (first == null);   }

    public int size () {
        int count = 0;
        Node current = first;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void insertFirst (char newData) {
        Node newFirst = new Node (newData);
        newFirst.setNext(first);
        first = newFirst;
    }
    public Node deleteFirst () {
        Node temp = first;
        first = first.getNext();
        return temp;   }

    public boolean search (int key) {
        boolean result = false;
        Node current = first;
        while (current != null) {
            if (current.getData () == key) {
                result = true;
                return result;  }
            else
                current = current.getNext();
        }
        return result;    }

    public void traverse () {
        System.out.print ("Current list: ");
        Node current = first;
        while (current != null) {
            current.displayNode ();
            System.out.print ("   ");
            current = current.getNext();  }
        System.out.println ();   }
}
