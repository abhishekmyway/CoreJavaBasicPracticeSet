package com.abc;  import java.util.HashSet;
class E { int i;
        E(int i){
                this.i = i;  }
        public String toString(){
                return "i="+i;  }
        public int hashCode(){
                return Integer.toString(i).hashCode();  }
        public boolean equals(Object obj){
                E e1 = (E)obj;
                return i == e1.i;
        }
}
