package OO.Concepts;

class StaticMethodHolder {
	private static int num1 =10;
	private int num2 =10;

	public static int adder (int a, int b) {
		System.out.println(num1);
		return a + b;
	}
}
public class StaticMethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticMethodHolder.adder(10, 20));
	}

}
