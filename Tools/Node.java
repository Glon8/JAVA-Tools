// Node (<T> - generic)

package Tools;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    //====================================================== \/
    public Node(T[] arr) {
        if (arr.length != 0) {
            boolean f = true;

            Node<T> n = this.next;

            for (int i = 1; i < arr.length; i++) {
                if (f) {
                    this.value = arr[0];

                    this.next = new Node<T>(arr[1]);

                    n = this.next;
                } else {
                    n.setNext(new Node<T>(arr[i]));

                    n = n.getNext();
                }

                f = false;
            }
        }
    }

    public void create(T[] arr){
        if (arr.length != 0) {
            boolean f = true;

            Node<T> n = this.next;

            for (int i = 1; i < arr.length; i++) {
                if (f) {
                    this.value = arr[0];

                    this.next = new Node<T>(arr[1]);

                    n = this.next;
                } else {
                    n.setNext(new Node<T>(arr[i]));

                    n = n.getNext();
                }

                f = false;
            }
        }
    }

    public int length() {
        int c = 1;

        Node<T> newNo = this.next;

        while (newNo != null) {
            c++;

            newNo = newNo.getNext();
        }

        return c;
    }

    public void addValue(T value) {
        Node<T> n = this.next;

        while (n != null) {
            if (!n.hasNext()) {
                n.setNext(new Node<T>(value));

                break;
            }

            n = n.getNext();
        }
    }

    public void addNode(Node<T> node) {
        Node<T> n = this.next;

        while (n != null) {
            if (!n.hasNext()) {
                n.setNext(node);

                break;
            }

            n = n.getNext();
        }
    }

    public void removeByValue(T value) {
        if (value != null) {
            Node<T> n;
            if (this.value == value) {
                this.value = this.next.getValue();

                this.next = this.getNext().getNext();
            } else {
                n = this.next;

                while (n != null) {
                    if (n.getValue() == value) {
                        if (n.hasNext()) {
                            n.setValue(n.getNext().getValue());

                            n.setNext(n.getNext().getNext());
                        }
                        break;
                    } else if (n.getNext().getValue() == value && !n.getNext().hasNext()) n.setNext(null);

                    n = n.getNext();
                }
            }
        }
    }

    public void removeByPlace(int place) {
        if (place > 0) {
            int c = 1;

            Node<T> n = this.next;

            while (n != null) {
                c++;

                n = n.getNext();
            }

            if (c > 1) {
                if (place == 1) {
                    this.value = this.next.getValue();

                    this.next = this.getNext().getNext();
                } else if (place <= c) {
                    n = this.next;

                    c = 2;

                    while (n != null) {
                        if (c == place) {
                            if (n.getNext().hasNext()) {
                                n.setValue(n.getNext().getValue());

                                n.setNext(n.getNext().getNext());
                            }

                            break;
                        }

                        if (c == place - 1 && !n.getNext().hasNext()) n.setNext(null);

                        c++;

                        n = n.getNext();
                    }
                }
            }
        }
    }

    //====================================================== /\
    @Override
    public String toString() {
        return this.value + " --> " + this.next;
    }
}
