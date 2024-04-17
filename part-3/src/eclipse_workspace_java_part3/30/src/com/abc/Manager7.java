package com.abc;
import java.util.Arrays;
public class Manager7 {
	public static void main(String[] args){
		F[] x = {
					new F(1,9),
					new F(5,1),
					new F(2,3),
					new F(9,5),
					new F(3,8),
					new F(7,4),
				};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new G());
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new H());
		System.out.println(Arrays.toString(x));
	}
}
