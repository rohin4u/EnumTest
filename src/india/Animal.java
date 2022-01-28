package india;

public enum Animal {
	
	Dog(40), Cat(50), Lion(20), Wolf;
	
	
	int price;
	
//	Animal(){
//		System.out.println("inside constroctor");
//	}
	
	Animal(int price){
		this.price=price;
	}
	Animal(){
		this.price=1000;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	

	
	
	
	
	
	

}
