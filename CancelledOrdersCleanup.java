class CancelledOrdersCleanup{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void Add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeAll(Node head, int code){
        Node current = head;
        Node prev = null;
        if (current != null && current.data == code){
            head = current.next;
            current = head;
        } else {
            while(current != null && current.data != code){
                prev = current;
                current = current.next;
            }
            if(current != null){
                prev.next = current.next;
            }
        }
        return head;
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ->");
            current = current.next;
        }
    }
    public static void main(String[] args){
        CancelledOrdersCleanup queue = new CancelledOrdersCleanup();
        queue.Add(1);
        queue.Add(2);
        queue.Add(3);
        queue.Add(2);
        queue.Add(4);
        queue.print();
        System.out.println();
        queue.removeAll(queue.head, 2);
        queue.print();
    }
}