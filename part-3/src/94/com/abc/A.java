package com.abc;  import java.util.PriorityQueue;
class A implements Comparable{
        int i;
        A(int i){
                this.i = i;
        }
        public int compareTo(Object obj){
                return i - ((A)obj).i;
        }
        public String toString(){
                return Integer.toString(i);
        }
}
