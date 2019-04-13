package heap;

public class HeapStatisticsDemo {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		long mb = 1024 * 1024;
		System.out.println("Maximum     memory " + runtime.maxMemory() / mb);
		System.out.println("Initial     memory " + runtime.totalMemory() / mb);
		System.out.println("Free        memory " + runtime.freeMemory() / mb);
		System.out.println("Consumed    memory "
				+ (runtime.totalMemory() - runtime.freeMemory()) / mb);

	}
}
