package india;

public class Test {

	public static void main(String[] args) {
		
		Animal a = Animal.Cat;
//		System.out.println(a);
//		System.out.println("exit of main");
		
//	Animal[] values = Animal.values();
//	
//	for(Animal val : values) {
//		
//		System.out.println(val+"...."+val.getPrice());
//	}
		
		switch(a) {
		
		case Dog: System.out.println("inside Dog");
		break;
		case Cat: System.out.println("inside cat");
		break;
		case Lion: System.out.println("inside lion");
		break;
		case Wolf: System.out.println("inside wolf");
		break;
		default:System.out.println("no matches available");
		break;
		}

	}

}
