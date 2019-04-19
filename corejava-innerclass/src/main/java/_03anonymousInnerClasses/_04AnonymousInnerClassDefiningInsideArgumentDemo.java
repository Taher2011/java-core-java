package _03anonymousInnerClasses;

public class _04AnonymousInnerClassDefiningInsideArgumentDemo {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("Child Thread using Anonymous approach");
				}
			}
		});
		
		t.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}
	}

}
