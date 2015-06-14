package OO.Concepts;

class ParentStaticMethodHolder {
	public static void print () {
		System.out.println("I am the Parent print()");
	}
	public void printOverride() {
		System.out.println("I am the Parent printOverride()");
	}
}

class SubStaticMethodHolder extends ParentStaticMethodHolder {
	public static void print() {
		System.out.println("I am the Child print()");
	}
	public void printOverride() {
		System.out.println("I am the Child printOverride()");
	}
}

public class StaticMethodTesterOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentStaticMethodHolder s1 = new SubStaticMethodHolder();
		s1.print();
		s1.printOverride();
	}

}
