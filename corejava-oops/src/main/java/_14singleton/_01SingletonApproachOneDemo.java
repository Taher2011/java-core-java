package _14singleton;

//For any java class, if we are allowed 
//to create only one object such type of 
//class is called Singleton

//Advantage of Singleton
//If several people have same requirement then it is not recommended
//to create separate object for every requirement. We have to create
//only one object and we can reuse the same object for every similar
// so that performance and memory utilization will be improved.

class SingletonOne {

	private static SingletonOne singletonOne = new SingletonOne();

	private SingletonOne() { // We can restrict child class creation

	}

	public static SingletonOne getSingletonOne() {
		return singletonOne;
	}

}

public class _01SingletonApproachOneDemo {

	public static void main(String[] args) {
		SingletonOne one = SingletonOne.getSingletonOne();
		SingletonOne two = SingletonOne.getSingletonOne();
		SingletonOne three = SingletonOne.getSingletonOne();

		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
	}

}
