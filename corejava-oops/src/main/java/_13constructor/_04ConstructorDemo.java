package _13constructor;

class E {
	E() {
		System.out.println(this.hashCode());
	}
}

class F extends E {
	F() {
		System.out.println(this.hashCode());
	}
}

public class _04ConstructorDemo {

	public static void main(String[] args) {
		
		E e = new E();
		System.out.println();
		
		F f = new F();
		System.out.println();
		
		E ef = new F();
		System.out.println();
		
		System.out.println(f.hashCode());
	}

}
