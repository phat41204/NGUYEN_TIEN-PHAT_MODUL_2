package arraylistandlinkedlist.linkedlt;

public class MyLinkedList {
    private Node head;
    private int numNodes;


    public MyLinkedList() {
        this.head = null;
        this.numNodes = 0;
    }


    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }


    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }


    public void addLast(Object data) {
        add(data);
    }


    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        numNodes--;
    }


    public void remove(Object o) {
        if (head == null) return;

        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.data.equals(o)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            numNodes--;
        }
    }

    // Truy cập phần tử tại vị trí index
    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    public int size() {
        return numNodes;
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public MyLinkedList clone() {
        MyLinkedList cloneList = new MyLinkedList();
        Node current = head;
        while (current != null) {
            cloneList.add(current.data);
            current = current.next;
        }
        return cloneList;
    }


    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
}