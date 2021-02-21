package _03widening;

public class _07ValidAutoBoxingAndWideningDemo {

	public static void main(String[] args) {
		int i1 = 10;
		Integer I = 10;  //AutoBoxing
	//	int i2 = 10L;
		Long L1 = 10L;   //AutoBoxing
	//	Long L2 = 10;
		long l3 = 10;    //Widening
		long l4 = 10L;    //AutoUnBoxing
		Object O = 10;   //AutoBoxing followed by Widening
		double d1 = 10;
	//	Double D1 = 10;
		Number N1 = 10;  //AutoBoxing followed by Widening
	}

}
