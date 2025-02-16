package Tools;

public class Stack<T> {
    private Node<T> first;

    public Stack() {
        this.first = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void push(T x) {
        this.first = new Node<>(x, this.first);
    }

    public T pop() {
        T x = this.first.getValue();
        this.first = this.first.getNext();
        return x;
    }

    public T top() {
        return this.first.getValue();
    }

    //====================================================== \/
    public Stack(T[] arr) {
        if (arr.length == 0) {
            this.first = null;
            return;
        }

        this.first = new Node<>(arr[0]);
        Node<T> node = this.first;

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                node.setValue(arr[i]);

                node.setNext(new Node<>(arr[0]));

                node = node.getNext();
            }
            else node.setValue(arr[i]);
        }
    }

    public Stack(Node<T> node) {
        this.first = node;
    }
    //====================================================== /\

    @Override
    public String toString() {
        String str = "[";
        if (this.first != null) {
            Node<T> pos = this.first;

            while (pos.hasNext()) {
                str = str + pos.getValue() + ",";
                pos = pos.getNext();
            }

            str = str + pos.getValue() + "]";
        } else str += " ]";
        return str;
    }
}


