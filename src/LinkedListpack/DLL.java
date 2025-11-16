package LinkedListpack;

public class DLL{
    private Node head;

    public void insertFir(int value){
            Node node = new Node(value);
            node.next = head;
            node.prev = null;
            if(head != null){
                head.prev = node;
            }
            head = node;
        }

    public void insertLast(int value){
            Node node = new Node(value);
            Node last = head;
            node.next = null;
            if(head == null){
                head = node;
                head.prev = null;
            }
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
            node.prev = last;
        }

    public Node find(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

    public void insert(int after, int val) {
            Node p = find(after);

            if (p == null) {
                System.out.println("does not exist");
                return;
            }

            Node node = new Node(val);
            node.next = p.next;
            p.next = node;
            node.prev = p;
            if (node.next != null) {
                node.next.prev = node;
            }
        }

    public void display(){
            Node node = head;
            Node last = null;
            while(node != null){
                System.out.print(node.value + "->");
                last = node;
                node = node.next;
            }

            System.out.println("END");

            while(last != null){
                System.out.print(last.value + "->");
                last = last.prev;
            }
            System.out.println("END");
        }

    private class Node{
        private Node next;
        private Node prev;
        private int value;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
