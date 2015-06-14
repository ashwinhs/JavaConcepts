package OO.Concepts;
//Learning, Variables cannot be overridden
//New Variables are created
//to access super classes variables, 1. 
class Super {
	String s = "Super";
}

class Sub extends Super {
	String s = "Sub";
}

public class FieldOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub c1 = new Sub();
		Super c2 = new Sub();
		
		System.out.println(c1.s);
		System.out.println(c2.s);
		System.out.println(((Super)c1).s);

	}

}
