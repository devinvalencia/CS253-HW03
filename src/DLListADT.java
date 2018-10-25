class DLListADT implements DLList {

    private NodeDL header;
    private NodeDL trailer;
    private int size;

    public DLListADT () {
        header = new NodeDL();
        trailer = new NodeDL();
        header.setNext(trailer);
        header.setPrev(null);
        header.setData(0);
        trailer.setPrev(header);
        trailer.setNext(null);
        trailer.setData(0);
        size = 0;                }

    public boolean empty () {
        return (size == 0);          }

    public int size () {
        return size;      }
    public void insertFirst (int newData) {
        NodeDL oldFirst = header.getNext();
        NodeDL newFirst = new NodeDL(newData, oldFirst, header);
        oldFirst.setPrev(newFirst);
        header.setNext(newFirst);
        size++;                                             }

    public void insertLast (int newData) {
        NodeDL oldLast = trailer.getPrev();
        NodeDL newLast = new NodeDL(newData, trailer, oldLast);
        oldLast.setNext(newLast);
        trailer.setPrev(newLast);
        size++;                                             }

    public NodeDL deleteFirst () {
        NodeDL oldFirst = header.getNext();
        NodeDL newFirst = oldFirst.getNext();
        newFirst.setPrev(header);
        header.setNext(newFirst);
        size--;
        return oldFirst;                     }

    public NodeDL deleteLast () {
        NodeDL oldLast = trailer.getPrev();
        NodeDL newLast = oldLast.getPrev();
        trailer.setPrev(newLast);
        newLast.setNext(trailer);
        size--;
        return oldLast;
    }

    public boolean search (int key) {
        boolean result = false;
        NodeDL current = header.getNext();
        while (current != trailer) {
            if (current.getData () == key) {
                result = true;
                return result;
            }
            else
                current = current.getNext();
        }
        return result;
    }

    public int last () {
        return (trailer.getPrev().getData());
    }

    public int first () {
        return (header.getNext().getData());
    }

    public void traverse () {
        System.out.print ("Current list: ");
        NodeDL current = header.getNext();
        while (current != trailer) {
            current.displayDLNode ();
            System.out.print ("   ");
            current = current.getNext();
        }
        System.out.println ();
    }
}




