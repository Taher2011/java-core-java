package _01enum;

import static java.lang.Math.*;

enum Beers {

	KF(50), RC(25), FO;    // public static final Beers KF = new Beers(50),
						   // public static final Beers RC = new Beers(25),
						   // public static final Beers FO = new Beers(),
	public int getPrice() {
		return price;
	}

	int price;

	Beers() {
		this.price = 75;
		System.out.println("Beers Default Cons");
	}

	Beers(int price) {
		this.price = price;
		System.out.println("Beers Arg Cons");
	}

}

public class _08EnumConstructorDemo {

	public static void main(String[] args) {

		Beers[] b = Beers.values();

		for (Beers beers : b) {
			System.out.println("price for " + beers + " " + beers.getPrice());
		}

		System.out.println(sqrt(4));
	}

}
