public interface DLList {
    public void insertFirst (int item);
    public void insertLast (int item);
    public NodeDL deleteFirst ();
    public NodeDL deleteLast ();
    public int size();
    public int last ();
    public int first ();
    public boolean empty ();
    public void traverse ();
}
