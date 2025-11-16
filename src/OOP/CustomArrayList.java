package OOP;

import java.util.Arrays;

public class CustomArrayList <T>{
    private T[] arr;
    private int size = 0;

    public CustomArrayList(){
        arr = (T[]) new Object[10];
    }

    public void add(T value){
        if(isFull()){
            T[] temp = (T[]) new Object[arr.length*2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size++] = value;
    }
    public boolean isFull(){
        return arr.length== size;
    }
    public T remove(){
        T removed = arr[size--];
        return removed;
    }
    public void display(){
        System.out.println(Arrays.toString(arr));
    }
}
