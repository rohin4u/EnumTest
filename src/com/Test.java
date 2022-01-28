package com;

public class Test {

	public static void main(String[] args) {
		
		Animal a = Animal.Dog;
//		System.out.println(a);
		
//		int ordinal = a.ordinal();
//		
//		Animal b = Animal.Lion;
//		int val = b.ordinal();
//		
//		System.out.println(val);
		
		Animal[] values = Animal.values();
		for(Animal valu : values) {
			System.out.println(valu);
			
		}
		
		

	}

}
