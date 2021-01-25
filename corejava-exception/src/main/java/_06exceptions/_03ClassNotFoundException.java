package _06exceptions;

/*If _06exceptions._02NoClassDefFoundErrorDemo1 doesn't exist in any of the classpath
 * then it throws ClassNotFoundException.*/

public class _03ClassNotFoundException {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("_06exceptions._02NoClassDefFoundErrorDemo1");
	}

}
