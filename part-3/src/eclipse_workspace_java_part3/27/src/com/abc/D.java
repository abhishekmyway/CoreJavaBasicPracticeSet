package com.abc;
class D implements Comparable{
	int i;
	D(int i){
		this.i = i;
	}
	
	public String toString(){
		return "i = "+i;
	}
	
	public int compareTo(Object obj){
		D d1 = (D)obj;
		return i-d1.i;
	}
}
