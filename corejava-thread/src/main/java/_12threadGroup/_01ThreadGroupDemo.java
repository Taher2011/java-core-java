package _12threadGroup;

public class _01ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}
}
