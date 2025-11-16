package ArrDeque;

import java.util.ArrayDeque;

public class Arrrdeque {
    private int[] a = new int[10];
    private int rear = -1;

    public void addLast(int val){
        if(rear==a.length-1){
            int[] temp = new int[a.length*2];
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }
        a[++rear] = val;
    }

    public void addFirst(int val){
        if(rear==a.length-1){
            int[] temp = new int[a.length*2];
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }
        if(rear==-1) {
            a[0] = val;
            rear++;
        }
        else{
            for (int i = ++rear; i >0 ; i--) {
                a[i] = a[i-1];
            }
            a[0] =val;
        }
    }

    public int pollFirst(){
        if(rear == -1){
            System.out.println("It is Empty");
            return -1;
        }
        int x = a[0];
        for (int i = 0; i <= rear; i++) {
            a[i] = a[i+1];
        }
        rear--;
        return x;
    }

    public int pollLast(){
        if(rear==-1){
            System.out.println("It is empty");
            return -1;
        }
        rear--;
        return a[rear+1];
    }

    public int peekFirst(){
        if(rear==-1){
            System.out.println("It is Empty");
            return -1;
        }
        return a[0];
    }

    public int peekLast(){
        if(rear==-1){
            System.out.println("It is Empty");
            return -1;
        }
        return a[rear];
    }

    public void display(){
        for (int i = 0; i <= rear; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
