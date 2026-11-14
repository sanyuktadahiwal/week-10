class RoundRobinGameTurns{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name = name;
            this.next = null;
        }
    }
    public void addLast(Node head, String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            head.next = head; 
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; 
        }
    }
    public void printTurns(int turns){
        System.out.println("Round Robin Game Turns:");
        if (turns <= 0) {
            System.out.println("No turns to display.");
            return;
        } else{
            Node head = new Node("Player 1");
            addLast(head, "Player 2");
            addLast(head, "Player 3");
            addLast(head, "Player 4");

            Node current = head;
            for (int i = 0; i < turns; i++) {
                System.out.println("Turn " + (i + 1) + ": " + current.name);
                current = current.next;
            }
        }
    }
}