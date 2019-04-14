package _12threadGroup;

public class _02ThreadGroupConstructorDemo {

	public static void main(String[] args) {

		ThreadGroup g1 = new ThreadGroup("FirstGroup");
		System.out.println(Thread.currentThread().getThreadGroup().getName());

		ThreadGroup g2 = new ThreadGroup(g1, "SecondGroup");
		System.out.println(g2.getParent().getName());

	}

}
