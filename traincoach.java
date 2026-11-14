class traincoach{
    static class Node {
        String name;
        Node prev;
        Node next;

        Node(String name) {
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;

    public void addLast(String name){
        Node newNode = new Node(name);
        if(head==null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void remove(String name){
        Node current = head;
        while(current!=null){
            if(current.name.equals(name)){
                if(current.prev!=null){
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if(current.next!=null){
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                break;
            }
        }
    }
    public void printForward(){
        Node current = head;
        while(current!=null){
            System.out.print(current.name + " ");
            current = current.next;
        }
    }
    public void printBackward(){
        Node current = tail;
        while(current!=null){
            System.out.print(current.name + "<-> ");
            current = current.prev;
        }
    }
    public static void main(String[] args){
        traincoach coach = new traincoach();
        coach.addLast("B1");
        coach.addLast("A1");
        coach.addLast("A2");
        coach.addLast("Engine");
        coach.printForward();
        System.out.println();
        coach.printBackward();
        coach.remove("B1");
    }
}