package Tools;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void insert(T x) {
        Node<T> temp = new Node<T>(x);

        if (this.first == null) this.first = temp;
        else this.last.setNext(temp);

        last = temp;
    }

    public T remove() {
        T x = this.first.getValue();

        this.first = this.first.getNext();

        if (this.first == null) this.last = null;

        return x;
    }

    public T head() {
        return this.first.getValue();
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    //====================================================== \/
    public Queue(T[] arr) {
        if(arr.length != 0)
        for (int i = 0; i < arr.length; i++) {
            Node<T> node = new Node<>(arr[i]);

            if (this.first == null) this.first = node;
            else this.last.setNext(node);

            last = node;
        }
    }

    public Queue(Node<T> node) {
        this.first = node;

        while (node != null) {
            if (!node.hasNext()) this.last = node;

            node = node.getNext();
        }
    }

    public void create(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Node<T> node = new Node<>(arr[i]);

            if (this.first == null) this.first = node;
            else this.last.setNext(node);

            last = node;
        }
    }

    public void create(Node<T> node) {
        this.first = node;

        while (node != null) {
            if (!node.hasNext()) this.last = node;

            node = node.getNext();
        }
    }

    public int length() {
        int count = 0;

        this.insert(null);

        while (this.head() != null) {
            this.insert(this.head());

            count++;

            this.remove();
        }

        this.remove();

        return count;
    }


    //====================================================== /\

    @Override
    public String toString() {
        String s = "[";

        Node<T> p = this.first;

        while (p.hasNext()) {
            s += " " + p.getValue();
            p = p.getNext();
        }

        s += " " + p.getValue() + " ]";

        return s;
    }

}
