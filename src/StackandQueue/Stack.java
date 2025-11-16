package StackandQueue;

public class Stack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.stack = new int[size];
    }

    public boolean isFull(){ return ptr == stack.length-1;}

    public boolean isEmpty(){
        return ptr == -1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("STACK IS FULL");
        }
        ptr++;
        stack[ptr] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("IT'S EMPTY");
        }
        return stack[ptr--];
    }
}
