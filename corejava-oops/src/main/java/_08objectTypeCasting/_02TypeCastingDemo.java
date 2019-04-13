package _08objectTypeCasting;

public class _02TypeCastingDemo {

	public static void main(String[] args) {

		Object object = new String("A");
		String string = (String) object;
		// StringBuffer buffer = (StringBuffer)object; // Run time exception

		String s = new String("A");
		// StringBuffer sb = (StringBuffer)s; // Compile time error
		// inconvertible type

		Object o = new String("B");
		Object o1 = (Object) o;

		String s1 = new String("C");
		Object o2 = (Object) s1;

	}

}
