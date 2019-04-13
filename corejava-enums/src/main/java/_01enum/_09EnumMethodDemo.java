package _01enum;

enum Color {
	
	BLUE, GREEN {                                    // public static final Color BLUE = new Color(),
		
		public void info() {                         // public static final Color GREEN = new Color() {
			System.out.println("Dangerous");              //   public void info() {
		}												//			System.out.println("Dangerous");
	},														// };
	
	RED;                                             // public static final Color RED = new Color(),

	public void info() {
		System.out.println("Universal");
	}
}

public class _09EnumMethodDemo {

	public static void main(String[] args) {
		Color[] color = Color.values();
		for (Color color2 : color) {
			color2.info();
		}
	}

}
