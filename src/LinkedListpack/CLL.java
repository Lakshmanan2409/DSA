package LinkedListpack;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(temp != null){
            do {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("END");
    }

    public void delete(int value){
        Node temp = head;
        if(temp.value == value){
            head = temp.next;
            tail.next = head;}
        else{
            while(temp != null && (temp.next.value != value) ){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
