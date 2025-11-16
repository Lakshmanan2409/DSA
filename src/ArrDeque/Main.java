package ArrDeque;

public class Main {
    public static void main(String[] args) {
        Arrrdeque ad = new Arrrdeque();
        ad.addFirst(4);
        ad.addFirst(3);
        ad.addFirst(2);
        ad.addLast(5);
        ad.addFirst(1);
        ad.addLast(6);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        ad.display();
    }
}
