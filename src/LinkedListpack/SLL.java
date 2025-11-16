package LinkedListpack;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size=0;
    }

    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail == null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int value){
        if(head == null){
            insertfirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int value){
        Node temp = get(index);
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        }
        if(index == size){
            tail = get(size);
            tail.next = null;
        }
        Node temp = get(index);
        temp.next = temp.next.next;
        size--;
    }

    public void display(){
        Node node = head;
        do{
            System.out.print(node.value + " -> ");
            node = node.next;
        }while(node != null);
        System.out.println("END");
    }

    private class Node {
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
