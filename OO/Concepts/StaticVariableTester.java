package OO.Concepts;

public class StaticVariableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticVariableHolder.name);
		StaticVariableHolder s1 = new StaticVariableHolder();
		System.out.println("s1.name = " + s1.name);
		s1.name = "I changed the static Variable!";
		StaticVariableHolder s2 = new StaticVariableHolder();
		System.out.println("s2.name = " + s2.name);
	}

}
