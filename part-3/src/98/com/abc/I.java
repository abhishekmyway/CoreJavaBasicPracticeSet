package com.abc;
import java.util.HashSet;
class I{
        int i,j;
        I(int i, int j){
                this.i = i;
                this.j = j;
        }
        public String toString(){
               return "("+i+","+j+")";
        }
        public int hashCode(){
               return Integer.toString(i).hashCode();
        }
        public boolean equals(Object obj){
                return (obj instanceof I && i==((I)obj).i && j== ((I)obj).j);
        }
}        





