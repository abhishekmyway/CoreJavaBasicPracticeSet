package com.abc;
import java.util.HashMap;

class Q
{
        int i;
        Q(int i){
                this.i = i;
        }
        public String toString(){
                return "(i="+i+")";
        }
        public int hashCode(){
                return Integer.toString(i).hashCode();
        }
        public boolean equals(Object obj){
                return (obj instanceof Q && i == ((Q) obj).i);
        }
}
