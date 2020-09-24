public class Node<E> {
    protected Object element;
    protected Node next;

    public Node(Object element) {
        this.element = element;
    }

    public Object getData(){
     return this.element;
    }
}
