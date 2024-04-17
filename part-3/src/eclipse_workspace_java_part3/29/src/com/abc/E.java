package com.abc;

class E implements Comparable{
	int i,j;
	E(int i,int j){
		this.i = i;
		this.j = j;
	}
	
	public String toString(){
		return "("+i+","+j+")";
	}
	
	public int compareTo(Object obj){
		E e1 = (E)obj;
		return e1.j-j;
	}
	
}
