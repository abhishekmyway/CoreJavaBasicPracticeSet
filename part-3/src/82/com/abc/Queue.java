package com.abc;
import java.util.LinkedList;
class Queue{
        private LinkedList list = new LinkedList();
        public void add(Object obj){
                list.add(obj);
        }
        public Object processElement(){
                return list.removeFirst();
        }
        public String toString(){
                return list.toString();
        }
}
