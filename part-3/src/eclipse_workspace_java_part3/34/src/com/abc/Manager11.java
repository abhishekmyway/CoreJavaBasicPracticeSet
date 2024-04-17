package com.abc;
public class Manager11 {
	public static void main(String[] args) {
		int x[][] = new int[3][2];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.println(x[i][j]);
			}
			System.out.println("--another row--");
		}
		int y[][] = new int[3][];
		//System.out.println(y[1][0]);
	}
}
