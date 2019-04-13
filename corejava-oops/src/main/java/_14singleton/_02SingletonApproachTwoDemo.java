package _14singleton;

//For any java class, if we are allowed 
//to create only one object such type of 
//class is called Singleton

//Advantage of Singleton
//If several people have same requirement then it is not recommended
//to create separate object for every requirement. We have to create
//only one object and we can reuse the same object for every similar
//so that performance and memory utilization will be improved.

class SingletonTwo {

	private static SingletonTwo singletonTwo;

	private SingletonTwo() { // We can restrict child class creation

	}

	public static SingletonTwo getSingletonTwo() {
		if (singletonTwo == null) {
			singletonTwo = new SingletonTwo();
		}
		return singletonTwo;
	}

}

public class _02SingletonApproachTwoDemo {

	public static void main(String[] args) {
		SingletonTwo one = SingletonTwo.getSingletonTwo();
		SingletonTwo two = SingletonTwo.getSingletonTwo();
		SingletonTwo three = SingletonTwo.getSingletonTwo();

		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
	}

}
