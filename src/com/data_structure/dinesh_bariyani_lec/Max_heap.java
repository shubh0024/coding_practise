package com.data_structure.dinesh_bariyani_lec;

public class Max_heap{
    Integer [] heap;//name of array with name heap
    int n;//size of array heap

    public Max_heap(int capacity){
        heap=new Integer[capacity+1];//index 0 will kept empty
        n=0;
    }
   public Boolean isEmpty(){
        return n==0;

    }
    public int size(){
      return n;
    }

    public void insert(int x){
        if(n== heap.length -1 ){
            resize(2 * heap.length);
        }
        n++;
        heap[n]=x;
        swim(n);
    }
    private void swim(int k){
        if(k>1 && heap[k/2] < heap[k]){
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k = k/2; //beacause we have to continue shifting up the inserted node until the node come to the correct postion
        }

    }
    private void resize(int capacity){
        Integer[] temp=new Integer[capacity];
        for(int i=0; i< heap.length; i++){
            temp[i]=heap[i];
        }
        heap=temp;
    }
    public void printheap(){
        for(int i=0; i<=n; i++){
            System.out.println(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        Max_heap mpq=new Max_heap(3);
        mpq.insert(3);
        mpq.insert(2);
        mpq.insert(1);
        mpq.insert(6);
        mpq.insert(8);
        mpq.insert(9);
        mpq.printheap();


    }
}
