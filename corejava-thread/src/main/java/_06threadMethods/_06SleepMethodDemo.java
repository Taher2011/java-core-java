package _06threadMethods;

public class _06SleepMethodDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
