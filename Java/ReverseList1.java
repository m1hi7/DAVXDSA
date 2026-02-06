class ReverseList1 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Add node (for testing)
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Recursive Reverse
    public Node reverseListRecursive(Node head){

        // Base case
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Print list
    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args){

        ReverseList1 list = new ReverseList1();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.printList();

        list.head = list.reverseListRecursive(list.head);

        list.printList();
    }
}
