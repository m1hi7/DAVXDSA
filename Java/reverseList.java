class reverseList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void reverseList() {

        if (head == null || head.next == null)
            return;

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;
    }
}
