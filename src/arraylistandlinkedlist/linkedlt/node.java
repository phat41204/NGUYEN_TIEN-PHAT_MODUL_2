package arraylistandlinkedlist.linkedlt;

class Node {
    Object data;  // Dữ liệu chứa trong Node
    Node next;    // Tham chiếu đến nút tiếp theo trong danh sách

    // Constructor
    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}