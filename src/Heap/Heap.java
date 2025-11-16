package Heap;

public class Heap {
//    public Heap(int size) {
//        MinHeap arr
//    }
    public void Insert(MinHeap a,int value,int capacity){
        if(a.size == capacity){
            return; }
        a.size++;
        a.arr[a.size-1] = value;
        for (int i = a.size-1; i!=0 && (a.arr[i]<a.parent(i))  ; i++) {
            a.arr = swap(a.arr,i,(i-1)/2);
            i= a.parent(i);
        }
    }

    private int[] swap(int[] a,int index1, int index2) {
        int z = a[index1];
        a[index1] = a[index2];
        a[index2] = z;
        return a;
    }

    public void heapify(MinHeap a,int i){
        int l = a.left(i);
        int r = a.right(i);
        int small = i;
        if(l<a.size && a.arr[l]<a.arr[i]) {
            small = l;
        }
        if(r<a.size && a.arr[r]<a.arr[small]) {
            small = l;
        }
        if(small != i){
            swap(a.arr,small,i);
            heapify(a,small);
        }
    }

    private class MinHeap{
        int[] arr;
        int size;
        int capacity;

        MinHeap(int c){
            this.arr = new int[c];
            size = 0;
            capacity = c;
        }
        int left(int i)  {return  (2*i + 1);}
        int right(int i) {return  (2*i + 2);}
        int parent(int i){return ((i-1)/ 2);}
    }
}
