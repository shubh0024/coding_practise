package com.data_structure.dinesh_bariyani_lec;

public class Topdown_reheapify {
        Integer [] heap;
        int n;

        public Topdown_reheapify(int capacity){
            heap = new Integer[capacity + 1];
        }

        public Boolean isEmpty(){
            return n==0;
        }

        public int size(){
            return n=heap.length;
        }

        public int deleteMaxheap(){
            int max=heap[1];
            swap(1,n);
            n--;
            sink(1);
            heap[n+1]=null;
            if(n>0 && (n==(heap.length - 1 )/4)){
                resize(heap.length / 2);
            }
            return max;
        }

        public void sink(int k){
            while(2*k <=n){
                int j= 2* k;
                if(j < n && heap[j] < heap[j+1]){
                    j++;

                }
                if(heap[k] >= heap[j]){
                    break;
                }
                swap(k,j);
                k=j;
            }
        }
        public int resize(int size){
            return heap.length;
        }

        public void swap(int a,int b){
            int temp=heap[a];
            heap[a]=heap[b];
            heap[b]=temp;

        }

}
