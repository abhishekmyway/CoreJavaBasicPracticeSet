package com.abc;
import java.util.LinkedList;
class Stack{
        private LinkedList list = new LinkedList();
        public void add(Object obj){
                list.add(obj);
        }
        public Object processElement(){
                return list.removeLast();
        }
        public String toString(){
                return list.toString();
        }
}
