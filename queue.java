class queue{
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void add(int data){
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
    Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ->");
            current = current.next;
        }
    }
    public static void main(String[] args){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();
        System.out.println();
        q.reverse(q.head);
        q.print();
    }
}